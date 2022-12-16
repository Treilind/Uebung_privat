package kontoManager;

public class Konto {

    private String inhaber;
    private double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public void einzahlen(double wert){
        this.kontostand = this.kontostand + wert;
    }

    public void auszahlen(double wert){
        if(this.kontostand >= wert)
            this.kontostand = this.kontostand - wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
