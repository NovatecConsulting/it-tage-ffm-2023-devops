
# Container

## Dockerfile Best Practices

## Docker schelchte und gute Praktiken um Container zu betreiben

### Der Run Befehl
| Level | Command Example |
|-------|---------|
| 😱     | docker run -it --privileged ubuntu bash  |
| 😨     | docker run -it ubuntu bash  |
| 😧     | docker run -it --security-opt=no-new-privileges ubuntu bash  |
| 😃     | docker run -it --security-opt=no-new-privileges --cap-drop=ALL --cap-add=net_bin_service ubuntu bash  |
| 🥰     | docker run -it --security-opt=no-new-privileges --cap-drop=ALL --cap-add=net_bind_service --cpu-shares=0.5 --memory=200 ubuntu bash  |

### Referenzen und weiterführende Links

- [Dockerfile Best Practices](https://docs.docker.com/develop/develop-images/dockerfile_best-practices/)
- [Docker Security Rootless](https://docs.docker.com/engine/security/rootless/)
- [Hadolint GitHub Repository](https://github.com/hadolint/hadolint)
- [Dive GitHub Repository](https://github.com/wagoodman/dive)
- [Docker Bench for Security GitHub Repository](https://github.com/docker/docker-bench-security)
- [Docker Security Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Docker_Security_Cheat_Sheet.html)

