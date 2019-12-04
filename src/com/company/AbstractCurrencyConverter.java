package com.company;

public abstract class AbstractCurrencyConverter {
    private double currency;

    public AbstractCurrencyConverter(double currency) {
        this.currency = currency;
    }
    public AbstractCurrencyConverter() {
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public abstract void printCurrency();
}
