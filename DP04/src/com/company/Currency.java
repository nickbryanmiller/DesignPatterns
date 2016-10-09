package com.company;

public class Currency extends Magnitude {

    // This is the value of the currency amount
    private double currency = 0;

    // This is the constructor that sets the currency amount
    public Currency(double c) {
        this.currency = c;
    }

    // We override the lessThan method
    @Override
    public boolean lessThan(Magnitude m) {
        // This is a try catch in case anyone tries to compare two different types
        try {
            // This is downcasting so we can reference the currency amount
            Currency cur = ((Currency) m);
            if (currency < cur.currency) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e) {
            System.out.println("There was an error: " + e.getLocalizedMessage());
            return false;
        }
    }
}