### Der Run Befehl
| Level | Command Example |
|-------|---------|
| 😱     | docker run -it --privileged ubuntu bash  |
| 😨     | docker run -it ubuntu bash  |
| 😧     | docker run -it --security-opt=no-new-privileges ubuntu bash  |
| 😃     | docker run -it --security-opt=no-new-privileges --cap-drop=ALL --cap-add=net_bin_service ubuntu bash  |
| 🥰     | docker run -it --security-opt=no-new-privileges --cap-drop=ALL --cap-add=net_bind_service --cpu-shares=0.5 --memory=200 ubuntu bash  |
