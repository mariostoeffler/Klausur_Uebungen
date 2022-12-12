package org.campus02.komplett1.oop;

public class CreditCardPayment extends Payment{

    private String cardNumber;
    private String securityNumber;


    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public double calcTransactionCosts() {
            if (!getCurrency().equals("EUR")) {
                return (1.5+getAmount())*0.0275;

            }
            if (getCurrency().equals("EUR")) {
                return (0.5+getAmount())*0.011;
            }

        return 0;
    }

    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityCode='" + securityNumber + '\'' +
                "Amount='" + getAmount() + '\'' +
                "Currency='" + getCurrency() + '\'' +
                "TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
