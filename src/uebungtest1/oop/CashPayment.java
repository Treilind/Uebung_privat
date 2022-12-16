package uebungtest1.oop;

public class CashPayment extends Payment {

    private String name;

    public CashPayment(double amount, Currencys currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    public CashPayment(double amount, Currencys currency) {
        super(amount, currency);
    }


    @Override
    public double calcTransactionCosts() {

        if(this.name.isEmpty()){
            return exchangeToEUR() + 2;
        }

        return exchangeToEUR();
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                super.toString() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
