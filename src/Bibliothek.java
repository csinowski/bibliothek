import java.util.*;
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

    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek();
        Buch java = new Buch();
        eBook C = new eBook();
        Person student = new Person();

        //java.setAnzahlExemplare(2);
        Buch.ausleihen();
        C.setTitel("Programming Languages and Systems");
        C.setAuthor("Sergey, Ilya");
        C.setJahr(2022);
        C.setDOI("http://doi.org/10.1007/978-3-030-99336-8");
        C.setEdition("Cham, 2022");
        C.setISBN("9783030993368");
        C.setKategorie("Informatik");
        C.setAnzahlExemplare(10);
        C.setDateiFormat("PDF");
        C.setOpenAccess();


        System.out.println("Wie lautet die ID des Benutzerausweises der Bibliothek?");

        Scanner scanner = new Scanner(System.in);
        String benutzerID = scanner.nextLine();
        student.setBenutzerID(benutzerID);
        Bibliothek.setBenutzerID(benutzerID); // TODO: globale Methode mit einer Variablen, die speichert, welches Buch welchem Benutzer zugeordnet ist
        Bibliothek.getAusgeliehenesBuch();

        System.out.println(Bibliothek.getAusgeliehenesBuch());
        System.out.println(student.getBenutzerID());
        System.out.println(Bibliothek.getBenutzerBuch());
        System.out.println(C.getDateiFormat());
        System.out.println(C.getOpenAccess());

        Student Constantin = new Student();
        Constantin.setECTS(133);
        // Gesetzt werden kann auch (240, 138) - die Werte sind variabel
        System.out.println(Constantin.getECTS()); // 138
        System.out.println(Constantin.getVerbleibendeECTS(Constantin.getECTS()));

        //java.abgabe();

    }
}
