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
            case "USD": temp = getAmount()*1.1;
            break;
            case "GBP": temp = getAmount()*0.85;
            break;
            case "SEK": temp = getAmount()*9.5;
            break;
            case "HUF": temp = getAmount()*310;
            break;
            default: temp= getAmount()*2;
        }
        return temp;
    }



    public String getCurrency() {
        return currency;
    }
}
