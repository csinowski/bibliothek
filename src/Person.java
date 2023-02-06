public class Person {

    public static String benutzerID;
    public static int ausgeliehenesBuch;
    //public static boolean getBenutzerID;

    // TODO: UI Login System mit Passwort

    public void setBenutzerID (String benutzerID) {
        Person.benutzerID = benutzerID;
    }

    public String getBenutzerID () {
       return benutzerID;
    }

    public int getAusgeliehenesBuch () {
        return Person.ausgeliehenesBuch;
    }

}
