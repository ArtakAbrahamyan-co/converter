package com.company;

public class Rubli extends AbstractCurrencyConverter {
    @Override
    public void printCurrency(){
        System.out.println(getCurrency() + "RUR");
    }
}
