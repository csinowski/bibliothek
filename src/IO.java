import java.util.Scanner;

class Eingabe {

    // System.out.println("Wie lautet die ID des Benutzerausweises der Bibliothek?");

    Scanner scanner = new Scanner(System.in);
    public String benutzerID = scanner.nextLine();
}

class Ausgabe {
    public static void main(String[] args) {

        Bibliothek Alexandria = new Bibliothek();
        Student Constantin = new Student();
        eBook IterativeEntwicklung = new eBook();
        IterativeEntwicklung.setTitel(
                "Iterative Entwicklung mit Versionsprotokollierung");
        IterativeEntwicklung.setSubTitel(
                "Wie kann die Softwareentwicklung mit der Protokollierung von Änderungen einzelner Klassen und Methoden verbessert werden?");

        Constantin.setECTS(133);
        // Gesetzt werden kann auch (240, 138) - die Werte sind variabel
        System.out.println(Constantin.getECTS()); // 138
        System.out.println(Constantin.getVerbleibendeECTS(Constantin.getECTS()));
    }
}
