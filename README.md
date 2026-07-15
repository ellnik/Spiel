# GuessGame

Ein kleines Java-Konsolenspiel zum Zahlenraten.

Der Spieler legt einen Zahlenbereich fest und versucht anschließend, die zufällig generierte Zahl mit möglichst wenigen Versuchen zu erraten.

---

## Funktionen

- ✅ Benutzer definiert Minimum und Maximum
- ✅ Zufällige Zahl wird generiert
- ✅ Hinweise bei falschen Eingaben:
  - Too small!
  - Too big!
- ✅ Zählt die Anzahl der Versuche
- ✅ Mehrere Spielrunden möglich
- ✅ Konsolenbasierte Benutzereingabe

---

## Projektstruktur

### GuessGame

Enthält die Hauptlogik des Spiels:

- Festlegen des Zahlenbereichs
- Erzeugen einer Zufallszahl
- Vergleichen der Benutzereingaben
- Verwaltung der Spielrunden
- Zählen der Versuche

### MyIO

Hilfsklasse für:

- Konsolenausgaben
- Einlesen von Zahlen
- Einlesen von Texten

### Start

Startklasse des Projekts.

Hier beginnt die Ausführung des Spiels.

### Boolean

Zusätzliche Übungsklasse mit Methoden für:

- Vergleich von Zahlen
- Prüfung auf gerade oder ungerade Zahlen
- Prüfung auf positive oder negative Zahlen
- Vergleich verschiedener Werte

---

## Spielablauf

1. Der Spieler gibt den Mindestwert ein.
2. Der Spieler gibt den Maximalwert ein.
3. Das Programm erzeugt eine zufällige Zahl innerhalb dieses Bereichs.
4. Der Spieler versucht, die Zahl zu erraten.
5. Das Programm gibt Hinweise:
   - **Too small!**
   - **Too big!**
6. Nach dem richtigen Tipp wird die Anzahl der Versuche angezeigt.
7. Anschließend kann eine neue Spielrunde gestartet werden.

---

## Beispiel

```text
Define min:
1

Define max:
20

Enter your number:
5
Too small!

Enter your number:
15
Too big!

Enter your number:
12
Well done!
Attempts: 3
```

---

## Verwendete Technologien

- Java
- Eclipse IDE

---

## Projekt starten

1. Projekt in Eclipse öffnen.
2. `Start.java` ausführen.
3. Mindest- und Maximalwert eingeben.
4. Die zufällig generierte Zahl erraten.
5. Das Spiel beliebig oft wiederholen.

---

## Lernziele

Dieses Projekt hilft beim Lernen von:

- Schleifen (`while`)
- Bedingungen (`if`)
- Methoden
- Klassen
- Arbeiten mit der Klasse `Random`
- Konsoleneingaben
- `boolean`-Werten
- Vergleichsoperatoren

---

## Besonderheiten

- Der Zahlenbereich wird vom Benutzer festgelegt.
- Ungültige Bereiche (z. B. `max <= min`) werden überprüft.
- Die Anzahl der Versuche wird gezählt.
- Das Spiel kann beliebig oft wiederholt werden.
- Einfache und übersichtliche Programmstruktur – ideal für Java-Anfänger.

---

Result:https://github.com/ellnik/Spiel/blob/main/spiel.png 
