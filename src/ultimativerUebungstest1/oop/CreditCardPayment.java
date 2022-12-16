package ultimativerUebungstest1.oop;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String securityCode;

    public CreditCardPayment(double amount, String currency, String cardNumber, String securityCode) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    @Override
    public double calcTransactionCosts() {
        if(!getCurrency().equals("EUR")){
            return 1.5 + exchangeToEUR() * 2.75 /100;
        }
       return 0.5 + exchangeToEUR() * 1.1 / 100;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", amount='" + exchangeToEUR() + '\'' +
                ", currency='" + getCurrency() + '\'' +
                ", transactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
