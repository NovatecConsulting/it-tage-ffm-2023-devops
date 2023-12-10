# Demo Inhalte:
- Pipeline für Continuous Integration (CI) im Zusammenhang mit einer React Anwendung

## Auslöser
- Reagiert auf Push-Events im Main-Branch, beschränkt auf bestimmte Pfade innerhalb des Repositorys
- Ermöglicht manuelles Auslösen über workflow_dispatch

## Jobs
- Enthält einen Job namens "build", der auf einem Ubuntu-Latest-Image läuft

## Schritte im "build"-Job
- Checkout: Hält die neueste Version des Codes bereit
- Install: Führt npm install im Verzeichnis der React-Anwendung aus
- Lint: Führt npm run lint aus, um Code-Stil und -Qualität zu überprüfen
- Test: Führt npm test aus, um sicherzustellen, dass Tests erfolgreich durchlaufen
- Build: Führt npm run build aus, um die React-Anwendung zu erstellen