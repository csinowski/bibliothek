/*
Stellen Sie sich ein Buchungssystem für Bücher und andere Medien in einer Bibliothek vor. Es gibt in dieser Bibliothek einen bestimmten Bestand an Büchern und digitalen Medien wie eBooks, DVDs und dergleichen. Diese Dinge lassen sich von Personen für einen bestimmten Zeitraum ausleihen. Dabei ist die Menge, die ausgeliehen werden kann, begrenzt.

Die Aufgaben ist, dieses Buchungs- beziehungsweise Ausleihsystem durch Klassen in einer objektorientierten Programmiersprache abzubilden.
Fokussieren Sie sich dabei bitte auf die Entitäten Buch, eBook, Bibliothek, Person und die Beziehungen ausleihen.

Eine Person kann Bücher und/oder eBooks aus der Bibliothek ausleihen. Die Bibliothek überwacht dabei den Bestand.

Überlegen Sie sich die notwendigen Objekte und setzen Sie diese in Java oder C# um.
Überlegen Sie sich bitte ebenfalls, welche Beziehungen die Objekte haben.
Zusätzlich soll es bei der Bibliothek eine Methode geben, die alle ausgeliehenen Dinge überprüft und schaut, ob eine gewisse Zeitspanne überschritten ist.
Sie müssen kein konkretes Datums-Objekt nutzen, sondern können die Dauer der Ausleihe als Tage (Integer) speichern.
Erkennt die Methode bei der Ausführung, dass es Objekte gibt, die bereits zu lange ausgeliehen sind, sollen die Titel der Bücher bzw. eBooks und die Personendaten ausgegeben werden.


*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Buch {

    public static String titel;
    private static String subtitel;

    public String author;

    public int jahr;

    public String edition;

    public String kategorie;

    public String ISBN;
    public String DOI;
    public static int anzahlExemplare;

    // List<Person> people = new ArrayList<Person>();

    // TODO: Listenfunktion mit Personen, die ein bestimmtes Buch ausgeliehen haben
    public static int anzahlAusgeliehen;

    public String setTitel(String titel) {
        Buch.titel = titel;
        return Buch.titel;
    }

    public static String getTitel() {
        return Buch.titel;
    }

    public String setSubTitel(String subtitel) {
        Buch.subtitel = subtitel;
        return Buch.subtitel;
    }

    public static String getSubTitel() {
        return Buch.subtitel;
    }

    public String setAuthor(String author) {
        this.author = author;
        return this.author;
    }

    public String getAuthor() {
        return this.author;
    }

    public int setJahr(int jahr) {
        this.jahr = jahr;
        return this.jahr;
    }

    public int getJahr() {
        return this.jahr;
    }

    public String setEdition(String edition) {
        this.edition = edition;
        return this.edition;
    }

    public String getEdition() {
        return this.edition;
    }

    public String setKategorie(String kategorie) {
        this.kategorie = kategorie;
        return this.kategorie;
    }

    public String getKategorie() {
        return this.kategorie;
    }

    public int setAnzahlExemplare(int anzahlExemplare) {
        Buch.anzahlExemplare = anzahlExemplare;
        return Buch.anzahlExemplare;
    };

    public int getAnzahlExemplare() {
        return anzahlExemplare;
    };

    public String setDOI(String DOI) {
        this.DOI = DOI;
        return this.DOI;
    }

    public String getDOI() {
        return this.DOI;
    }

    public String setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this.ISBN;
    }

    public String getISBN(String ISBN) {
        return this.ISBN;
    }

    public int getAnzahlAusgeliehen() { // TODO: System für Ausleihe und Rückgabe verbessern
        anzahlAusgeliehen = anzahlExemplare - anzahlAusgeliehen;
        return anzahlAusgeliehen;
    };

    static LocalDate datumAusleihe = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // TODO: passende Formatierung finden
    String text = datumAusleihe.format(formatter);
    LocalDate parsedDate = LocalDate.parse(text, formatter);
    static LocalDate datumAbgabe = datumAusleihe.plusDays(28);

    public static void ausleihen() {

        if (Buch.anzahlAusgeliehen == Buch.anzahlExemplare) {
            System.out.println("Dieses Buch ist zurzeit nicht verfügbar, bitte versuche es zu einem anderen Zeitpunkt.");
        } else {
            Buch.anzahlAusgeliehen--;
            Person.ausgeliehenesBuch++;
            Bibliothek.setAusgeliehenesBuch(Person.benutzerID);
            // TODO: Kombination aus Zuweisung eines Buches auf einen bestimmten Nutzer
        }

        System.out.println("Heute ist der " + datumAusleihe + ". Am " + datumAbgabe + " sollte das Buch zurückgegeben oder die Leihfrist verlängert worden sein.");

    };

    public void abgabe() {

        LocalDate heute = LocalDate.now();
        if (heute.isAfter(datumAbgabe)) {
            System.out.println("Die Leihfrist ist nicht eingehalten worden. Es fällt eine Gebühr von 3,50€ an.");
        } else {
            Buch.anzahlAusgeliehen++;
        }
    }
}
