package Wasserstand;

public class Wasserstand {

    private int id;
    private String geweasserName;
    private double messWert;
    private double messWertFuerAlamierung;
    private int zeitpunkt;

    public Wasserstand(int id, String geweasserName, double messWert, double messWertFuerAlamierung, int zeitpunkt) {
        this.id = id;
        this.geweasserName = geweasserName;
        this.messWert = messWert;
        this.messWertFuerAlamierung = messWertFuerAlamierung;
        this.zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeweasserName() {
        return geweasserName;
    }

    public void setGeweasserName(String geweasserName) {
        this.geweasserName = geweasserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlamierung() {
        return messWertFuerAlamierung;
    }

    public void setMessWertFuerAlamierung(double messWertFuerAlamierung) {
        this.messWertFuerAlamierung = messWertFuerAlamierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", geweasserName='" + geweasserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlamierung=" + messWertFuerAlamierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }
}
