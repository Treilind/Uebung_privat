package ultimativerUebungstest1.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment p){
        payments.add(p);
    }

    public double totalTransactionCosts() {
        double total = 0;

        for (Payment p : payments) {
            total += p.calcTransactionCosts();
        }
        return total;
    }

    public HashMap<String, Double> getPaymentsPerCurrency() {
        HashMap<String, Double> sumPayments = new HashMap<>();

        for (Payment p : payments) {
            if(sumPayments.containsKey(p.getCurrency())){
                Double temp = sumPayments.get(p.getCurrency()) + 1;
                sumPayments.put(p.getCurrency(), temp);
            }
            else {
                sumPayments.put(p.getCurrency(), 1.0);
            }
        }
        return sumPayments;
    }
}
