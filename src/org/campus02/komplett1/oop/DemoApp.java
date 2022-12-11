package org.campus02.komplett1.oop;

public class DemoApp {
    public static void main(String[] args) {


        Payment payment = new Payment(100, "USD") {
            @Override
            public double calcTransactionCosts() {
                return 0;
            }
        };

        System.out.println(payment.exchangeToEUR());



    }
}
