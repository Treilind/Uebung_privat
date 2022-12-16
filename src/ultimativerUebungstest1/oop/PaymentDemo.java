package ultimativerUebungstest1.oop;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentJournal pJ = new PaymentJournal();
        CreditCardPayment ccp = new CreditCardPayment(5000, "USD", "12345678A", "B3A");
        CashPayment cp = new CashPayment(7000, "GBP", "Thorsten");
        MaestroPayment mp = new MaestroPayment(3000, "EUR", "8563478JD3");

        pJ.add(ccp);
        pJ.add(cp);
        pJ.add(mp);

        System.out.println(ccp);
        System.out.println(cp);
        System.out.println(mp);

        System.out.println(pJ.getPaymentsPerCurrency());

    }
}
