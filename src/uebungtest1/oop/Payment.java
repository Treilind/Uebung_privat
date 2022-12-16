package uebungtest1.oop;

public abstract class Payment {
    private double amount;
    private Currencys currency;

    public Payment(double amount, Currencys currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract double calcTransactionCosts();

    public double exchangeToEUR() {

        return this.amount / this.currency.convertionRate;
    }

    public Currencys getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return ",amount=" + amount +
                ", currency=" + currency;
    }
}


