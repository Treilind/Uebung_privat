package kontoManager;

public class JugendGiroKonto extends Girokonto{
    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void auszahlen(double wert) {
        if(wert <= this.buchungslimit && (getKontostand() - wert) > getLimit())
            super.auszahlen(wert);
        else {
            System.out.println("Diese Transaktion kann nicht durchgeführt werden");
        }
    }
}
