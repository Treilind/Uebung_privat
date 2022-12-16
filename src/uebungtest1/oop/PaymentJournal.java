package uebungtest1.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> paymentList;

    public PaymentJournal() {
        this.paymentList = new ArrayList<>();
    }

    public void add (Payment p) {
        paymentList.add(p);
    }

    public void print (){
        for (Payment p : paymentList) {
            System.out.println(p.toString());
        }
    }

    public double totalTransactionCosts(){
        double total = 0;

        for (Payment p: paymentList) {
            total = total + p.calcTransactionCosts();
        }
        return total;
    }

    public HashMap<Currencys, Double> getPaymentsPerCurrency() {
        HashMap<Currencys, Double> paymentCurrency = new HashMap<>();

        for (Payment p : paymentList) {
            if(paymentCurrency.containsKey(p.getCurrency())){
                Double newPayment = p.getAmount() + paymentCurrency.get(p.getCurrency());
                paymentCurrency.put(p.getCurrency(), newPayment);
            }
            else {
                paymentCurrency.put(p.getCurrency(), p.getAmount());
            }
        }

        return paymentCurrency;
    }
}
