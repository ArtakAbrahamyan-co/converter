package com.company;

public class Euro extends AbstractCurrencyConverter {
    @Override
    public void printCurrency() {
        System.out.println(getCurrency() + "EUR");
    }
}
