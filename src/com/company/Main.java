package com.company;

public class Main {

    public static void main(String[] args) {
        Converter converter = new EuroConverter();
        EuroConverter euroConverter = new EuroConverter();
        Dollar dollar = new Dollar();
        dollar.setCurrency(5000);
        AbstractCurrencyConverter convert =euroConverter.convert(dollar);
        convert.printCurrency();

    }
}
