package kontoManager;

public class Girokonto extends Konto {
    private double limit;

    public Girokonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void auszahlen(double wert) {
        if((getKontostand() - wert) > limit)
            super.auszahlen(wert);
        else {
            System.out.println("Maximalüberzug ist 1000€");
        }
    }

    public double getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return "Girokonto{" +
                "limit=" + limit +
                '}';
    }
}
