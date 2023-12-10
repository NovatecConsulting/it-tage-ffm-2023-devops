# Security Automatisierung

## Security Testing

![Security Testing Pyramide](../99_assets/images/security_testing_pyramide.png)

### ToDo's für jeden Layer der Pyramide

* Static Application Security Testing (SAST)
  ![SAST](../99_assets/images/SAST.png)


* Dynamic Application Security Testing (DAST)
  ![DAST](../99_assets/images/DAST.png)


* Security Tools für die CI-/CD-Pipeline
  ![CICD Tooling](../99_assets/images/CICD_tools.png)

Eine beispielhafte Pipeline mit GitHub Actions ist in diesem [Projekt](https://github.com/andifalk/supply-chain-security) zu finden.  

* Code Reviews

* Pentests
  ![Pentestflow](../99_assets/images/pentest_schritte.png)

* Software Composition Analysis (SCA)
  ![SCA](../99_assets/images/SCA.png)

  

## Security Observability

Um jederzeit auskunftsfähig bezüglich der Sicherheit aller Anwendungen und Umgebungen zu sein werden entsprechende Protokollierungen und ein Monitoring benötigt.

Heute moderne Observability Systeme beinhalten meist ein SIEM (Security Information and Event System).  
Mit diesem werden alle damit verbundenen Logs, Metriken und Ereignisse verknüpft so dass das SIEM mit Hilfe von Künstlicher Intelligenz und Machine Learning automatisiert Angriffspatterns erkennen kann.  Darüber hinaus sind damit dann auch (semi-)automatische Reaktionsmöglichkeiten verbunden.

![SIEM](../99_assets/images/siem.png)
