# SBOM Demos

In diesem Praxisbeispiel setzen wir uns mit SBOM's im CycloneDX Format und dem Tool DependencyTrack auseinander.

## Angular Demo App

Im Ordner _sample_angular_app_ ist eine frisch mit den Angular CLI Tools erzeugte _leere_ Angular Anwendung enthalten.

## Log4Shell Spring Boot Demo App

Im Ordner _Log4Shell_ ist eine von der Log4Shell betroffene Spring Boot Java Anwendung enthalten.

## Industriemaschine

In der SBOM _industrie_maschine_sbom.json ist eine SPS mit entsprechendem Betriebssystem enthalten.

## OWASP Dependency Track

OWASP Dependency Track (nicht zu verwechseln mit OWASP Dependency Check) ist eine Continuous SBOM Analyse Plattform um das Supply Chain Risiko zu reduzieren.  

Die Idee hier ist, dass alle Softwareprojekte eines Unternehmens regelmäßig ihre SBOM's (Software Bill of Material Listen) im CycloneDX Format auf diese Plattform hochladen.  

Dependency Track analysiert dann kontinuierlich automatisch alle SBOM's auf neue bekannte Schwachstellen und Lizenzverletzungen (u.a. bei Verwendung von GPL Lizenzen bei OSS).

![Dependency Track](../../99_assets/images/dep_track.png)

### Starten von Dependency Track

Um mit diesem Werkzeug lokal los zu legen benötigt man eine Docker Umgebung mit Docker-Compose Support.

Zum Starten in einer Konsole einfach in dasselbe Unterverzeichnis wie diese Readme Datei wechseln un dann das folgende Kommando eingeben:

```shell
docker-compose up -d
```

Nach dem Start kann die Anwendung unter [http://localhost:8080](http://localhost:8080) aufgerufen werden.

Benutzer: admin
Passwort: admin

Anschließend ist noch eine Passwortänderung erforderlich.  

Jetzt ist das Tool einsatzbereit und SBOM's aus den hier einhaltenen Projekten können importiert werden.

```shell
docker-compose down
```

wieder beendet werden.

## Referenzen und weiterführende Links

- [CycloneDX](https://cyclonedx.org)

- [Dependency Track](https://dependencytrack.org)
