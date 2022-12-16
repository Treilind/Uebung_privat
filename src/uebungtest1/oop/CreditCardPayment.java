package uebungtest1.oop;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String securityNumber;

    public CreditCardPayment(String cardNumber, String securityNumber, double amount, Currencys currency) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }


    @Override
    public double calcTransactionCosts() {
        if (this.getCurrency() != Currencys.EUR) {
            return 1.5 + this.exchangeToEUR() * 1.0275;
        }
        return 0.5 + exchangeToEUR() * 1.011;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                super.toString() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
