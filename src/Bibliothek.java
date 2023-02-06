import java.lang.*;

public class Bibliothek {

    public static void setAusgeliehenesBuch(String benutzerID) {
        Person.benutzerID = benutzerID;
    }

    public static String getAusgeliehenesBuch () {
        return Buch.titel;
    }

    public static void setBenutzerID(String benutzerID) {
        Person.benutzerID = benutzerID;
    }

    public static String getBenutzerBuch () {
        return Person.benutzerID;
    }

    // Map<Buch, ArrayList<Person>> booksToPeople = new Map<Buch, ArrayList<Person>>();

    // List<Buch> books = new ArrayList<Buch>();
    // TODO: Listenfunktion mit Zuweisungen von Büchern zu Personen wie auch ausgeliehenen Büchern bei einzelnen Personen
}
