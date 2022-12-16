package uebungtest1.oop;

public class DemoPayment {

    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment("1234567987", "AB12",5000, Currencys.USD);
        MaestroPayment mp = new MaestroPayment(6000, Currencys.EUR, "65873365");
        CashPayment cp = new CashPayment(7000, Currencys.GBP, "Thorsten");
        CashPayment cpReal = new CashPayment(3000, Currencys.GBP, "Thorsten");


        PaymentJournal pj = new PaymentJournal();

        pj.add(ccp);
        pj.add(mp);
        pj.print();

        System.out.println();
        pj.add(cp);
        pj.add(cpReal);
        pj.print();
        System.out.println();
        System.out.println(pj.totalTransactionCosts());
        System.out.println(pj.getPaymentsPerCurrency());



    }
}
