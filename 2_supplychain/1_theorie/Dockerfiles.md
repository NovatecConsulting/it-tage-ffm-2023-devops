# Dockerfile

## Problemstellung
### Keine Reproduzierbarkeit beim Base Image
- Base Image ist nicht reproduzierbar
- Base Image ist nicht verifizierbar

#### Lösung
- Base Image selbst bauen
- Base Image verifizieren
- Base Image Version pinning

### Keine Reproduzierbarkeit beim Build
- Build ist nicht reproduzierbar
- Build ist nicht verifizierbar

#### Lösung
- Build verifizieren
- Build Version pinning (package-lock.json, Gemfile.lock, requirements.txt)

### Layering
- Falsche Reihenfolge der Layer

#### Lösung
- Dateien mit häufigen Änderungen nach unten

### Root User
- Root User in Container

#### Lösung
- Letzer User sollte nicht root sein