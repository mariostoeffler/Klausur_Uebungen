package org.campus02.komplett1.oop;

public abstract class Payment {

    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

   public abstract double calcTransactionCosts();

    public double exchangeToEUR() {
        double temp = 0;

        switch (getCurrency()) {
            case "USD": temp = amount*1.1;
            break;
            case "GBP": temp = amount*0.85;
            break;
            case "SEK": temp = amount*9.5;
            break;
            case "HUF": temp = amount*310;
            break;
            default: temp= amount*2;
        }
        return temp;
    }



    public String getCurrency() {
        return currency;
    }

}
