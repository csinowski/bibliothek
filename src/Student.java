public class Student extends Person {
    private String studiengang; // Datentyp String speichert Textzeichen
    public int kursECTS = 5;
    private int bachelorECTS = 180;
    public int masterECTS = 240;
    private int ECTS;

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public int getECTS() {
        return this.ECTS;
    }

    public int getVerbleibendeECTS(int ECTS) {
        int verbleibendeECTS;
        verbleibendeECTS = bachelorECTS - (ECTS + kursECTS);
        return verbleibendeECTS;
    }
};

