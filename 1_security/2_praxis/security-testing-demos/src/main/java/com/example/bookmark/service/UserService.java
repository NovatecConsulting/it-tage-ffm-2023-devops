package com.example.bookmark.service;

import com.example.bookmark.data.CustomUserEntityRepository;
import com.example.bookmark.data.UserEntity;
import com.example.bookmark.data.UserEntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserEntityRepository userEntityRepository;
    private final CustomUserEntityRepository customUserEntityRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserEntityRepository userEntityRepository, CustomUserEntityRepository customUserEntityRepository, PasswordEncoder passwordEncoder) {
        this.userEntityRepository = userEntityRepository;
        this.customUserEntityRepository = customUserEntityRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> findUserByEmail(String email) {
        return customUserEntityRepository.findUserByEmail(email).map(this::toUser);
    }

    public Optional<User> findByIdentifier(String userIdentifier) {
        return userEntityRepository.findOneByIdentifier(userIdentifier).map(
                this::toUser
        );
    }

    @Transactional
    public User createUser(User user) {
        if (user.getIdentifier() == null) {
            user.setIdentifier(UUID.randomUUID().toString());
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return toUser(userEntityRepository.save(toUserEntity(user)));
    }

    @Transactional
    public void changePassword(String userIdentifier, String oldPassword, String newPassword) {
        UserEntity userEntity = userEntityRepository.findOneByIdentifier(userIdentifier).map(
                u -> {
                    u.setPassword(passwordEncoder.encode(newPassword));
                    userEntityRepository.save(u);
                    return u;
                }
        ).orElseThrow(() -> new IllegalArgumentException("No user found for identifier [" + userIdentifier + "]"));
        LOGGER.info("Successfully change password of user [{}] from [{}] to [{}]",
                userEntity.getEmail(), oldPassword, newPassword);
    }

    public List<User> findAll() {
        return userEntityRepository.findAll().stream().map(this::toUser).collect(Collectors.toList());
    }

    private User toUser(UserEntity u) {
        return new User(
                u.getIdentifier(), u.getFirstName(), u.getLastName(),
                u.getPassword(), u.getEmail(), u.getRoles());
    }

    private UserEntity toUserEntity(User u) {
        return new UserEntity(
                u.getIdentifier(), u.getFirstName(), u.getLastName(),
                u.getPassword(), u.getEmail(), u.getRoles());
    }

    @Transactional
    public void deleteUserByIdentifier(String userIdentifier) {
        userEntityRepository.deleteByIdentifier(userIdentifier);
    }
}
