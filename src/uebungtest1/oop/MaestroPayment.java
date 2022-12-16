package uebungtest1.oop;

public class MaestroPayment extends Payment{

    private String cardNumber;

    public MaestroPayment(double amount, Currencys currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {

        if (exchangeToEUR() * 1.0075 < exchangeToEUR() + 0.95){
            return exchangeToEUR() + 0.95;
        }

        return exchangeToEUR() * 1.0075;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                super.toString() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
