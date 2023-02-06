public class eBook extends Buch {

    public String dateiFormat;

    public boolean openAccess;

    public String setDateiFormat(String dateiFormat) {
        this.dateiFormat = dateiFormat;
        return this.dateiFormat;
    }

    public String getDateiFormat() {
        return this.dateiFormat;
    }

    /*
    @Override
    public void ausleihen() {

    };

    @Override
    public void abgabe() {

    };
    */

    public boolean setOpenAccess() {
        this.openAccess = true;
        return true;
    }

    public boolean getOpenAccess() {
        return this.openAccess;
    }

}
