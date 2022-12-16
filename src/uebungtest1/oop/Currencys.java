package uebungtest1.oop;

public enum Currencys {
    USD("USD", 1.1),
    GBP("GBP", 0.85),
    SEK("SEK", 9.5),
    HUF("HUF", 310),
    EUR("EUR", 1),
    OTHERS("OTHERS", 2);


    public final String label;

    public final double convertionRate;

    private Currencys(String label, double convertionRate) {
        this.label = label;
        this.convertionRate = convertionRate;
    }
}
