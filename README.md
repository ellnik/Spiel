GuessGame

Ein kleines Java-Konsolenspiel zum Zahlenraten.
Der Spieler legt einen Zahlenbereich fest und versucht anschließend, die zufällig generierte Zahl zu erraten.

Funktionen
Benutzer definiert Minimum und Maximum
Zufällige Zahl wird generiert
Hinweise:
Too small!
Too big!
Zählt die Anzahl der Versuche
Mehrere Spielrunden möglich
Konsoleneingabe mit Scanner
Projektstruktur
GuessGame

Enthält die komplette Spiellogik:

Zahlenbereich festlegen
Zufallszahl erzeugen
Eingaben vergleichen
Spielrunden verwalten
MyIO

Hilfsklasse für:

Konsolenausgaben
Einlesen von Zahlen
Einlesen von Texten
Start

Startklasse des Programms.
Hier beginnt das Spiel.

Boolean

Zusätzliche Übungsklasse mit Methoden für:

Vergleich von Zahlen
Gerade/Ungerade prüfen
Positive und negative Zahlen prüfen
Zahlen vergleichen
Spielablauf
Spieler gibt Minimum ein
Spieler gibt Maximum ein
Das Programm erzeugt eine Zufallszahl
Spieler versucht die Zahl zu erraten
Das Programm gibt Hinweise aus
Nach dem Gewinn kann erneut gespielt werden
Beispiel
define min:
1

define max:
20

enter your number:
5
Too small!

enter your number:
15
Too big!

enter your number:
12
Well done! Attempts number: 3
Verwendete Technologien
Java
Eclipse IDE
Projekt starten
Projekt in Eclipse öffnen
Start.java starten
Zahlenbereich eingeben
Zahl erraten
Lernziel

Dieses Projekt hilft beim Lernen von:

Schleifen (while)
Bedingungen (if)
Methoden
Klassen
Zufallszahlen mit Random
Konsoleneingaben
boolean-Werten
Vergleichsoperatoren
Besonderheiten
Der Zahlenbereich wird vom Benutzer festgelegt
Das Spiel prüft falsche Bereiche (max <= min)
Anzahl der Versuche wird gezählt
Mehrere Spielrunden möglich

Result:https://github.com/ellnik/Spiel/blob/main/spiel.png 
