package ultimativerUebungstest1.oop;

public class CashPayment extends Payment {

    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    @Override
    public double calcTransactionCosts() {
        if(this.name == null) {
            return exchangeToEUR() + 2;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "amount='" + exchangeToEUR() + '\'' +
                "currency='" + getCurrency() + '\'' +
                "transactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
