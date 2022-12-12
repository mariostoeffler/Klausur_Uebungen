package org.campus02.komplett1.oop;

public class DemoApp {
    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(100, "USD", "2342342", "2329329");
        CreditCardPayment creditCardPayment1 = new CreditCardPayment(100, "EUR", "2342342", "2329329");

        Payment payment1 = new Payment(100, "GBP") {
            @Override
            public double calcTransactionCosts() {
                return 0;
            }
        };
        Payment payment = new Payment(100, "USD") {
            @Override
            public double calcTransactionCosts() {
                return 0;
            }
        };

        System.out.println(payment.exchangeToEUR());
        System.out.println(payment1.exchangeToEUR());

        System.out.println();

        System.out.println(creditCardPayment1.calcTransactionCosts());
        System.out.println(creditCardPayment.calcTransactionCosts());

        System.out.println(creditCardPayment1.toString());
        System.out.println(creditCardPayment.toString());



    }
}
