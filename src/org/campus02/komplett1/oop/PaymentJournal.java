package org.campus02.komplett1.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {

    private ArrayList<Payment> paymentList = new ArrayList<>();

    public void add(Payment p) {
        paymentList.add(p);
    }


    public double totalTransactionCosts() {
        double sum = 0;
        for (Payment payment : paymentList) {
            sum = payment.calcTransactionCosts() + sum;
        }
        return sum;
    }

    public HashMap<String, Double> getPaymentsPerCurrency() {
        double tempNumberUSD = 0;
        double tempNumberEUR = 0;
        double tempNumberSEK = 0;
        double tempNumberHUF = 0;
        HashMap<String, Double> tempList = new HashMap<>();
        for (Payment payment : paymentList) {
            switch (payment.getCurrency()) {
                case "USD":
                    tempList.put("USD", ++tempNumberUSD);
                    continue;
                case "EUR":
                    tempList.put("EUR", ++tempNumberEUR);
                    continue;
                case "SEK":
                    tempList.put("SEK", ++tempNumberSEK);
                    continue;
                case "HUF":
                    tempList.put("USD", ++tempNumberHUF);
                    continue;
            }
        }
        return tempList;
    }
}
