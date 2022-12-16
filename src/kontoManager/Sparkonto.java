package kontoManager;

public class Sparkonto extends Konto{

    public Sparkonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public void auszahlen(double wert) {
        if ((getKontostand() - wert) > 0)
            super.auszahlen(wert);
        else {
            System.out.println("Der Kontostand darf nicht unter 0 fallen");
        }
    }
}
