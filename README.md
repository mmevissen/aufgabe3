# KSwe SoSe 2017 - Aufgabe 3

Erstellung einer Webanwendung, die bei Aufruf im Browser aktuelle
Wetterparameter für Bochum ausgibt. Maven soll hierbei zur Projektverwaltung
genutzt werden.

## Beschreibung

Mit Hilfe von Maven Archetypes soll eine Webanwendung erstellt werden, die
aktuelle Wetterparameter für Bochum von der
[OpenWeatherMap](http://openweathermap.org/api) bezieht. Dazu soll
mit der OWM-API interagiert werden - zunächst muss also ein API-Key kreiert
werden.

### Nutzung von Abhändigkeiten

Die Aufgabe soll explizit durch die Integration einer Third-Party-Library zur
API-Interaktion mit der OpenWeatherMap umgesetzt werden. Kandidaten:

* https://bitbucket.org/akapribot/owm-japis
* https://github.com/migtavares/owmClient

### Starten der Anwendung

Die Anwendung soll entweder über das Eclipse-Plugin `run-jetty-run` gestartet
werden oder durch Einbindung des `jetty-maven-plugin` (CLI: `mvn jetty:run`).

## Ergebnis

Bei Aufruf im Browser sollen die aktuellen Wetterparameter für Bochum angezeigt
werden. Das Format kann hierbei frei gewählt werden. Beispielsweise kann JSON
oder aber auch eine HTML-Seite ausgegeben werden.

Das Ergebnis soll als GitHub-Repository online gestellt werden.

## Zusatzaufgabe

* Biete dem Nutzer die Möglichkeit, das Wetter für weitere Städte abzufragen.
Hierfür soll per URL die Stadt übergeben werden, z.B.: `http://localhost:8080/weather?city=Dortmund`
