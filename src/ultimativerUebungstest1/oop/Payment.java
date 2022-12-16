package ultimativerUebungstest1.oop;

public abstract class Payment {

    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR() {
        double newAmount = 0;

        switch (this.currency){
            case "USD":
                newAmount = this.amount / 1.1;
                break;
            case "GBP":
                newAmount = this.amount / 0.85;
                break;
            case "SEK":
                newAmount = this.amount / 9.5;
                break;
            case "HUF":
                newAmount = this.amount / 310;
                break;
            case "EUR":
                newAmount = this.amount;
                break;
            default:
                newAmount = this.amount / 2;
        }
        return newAmount;
    }

    public String getCurrency() {
        return currency;
    }

}
