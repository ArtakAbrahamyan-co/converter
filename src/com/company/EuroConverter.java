package com.company;

public class EuroConverter implements Converter {
    @Override
    public AbstractCurrencyConverter convert(AbstractCurrencyConverter unit) {
        double temp;
        if (unit instanceof Dollar){
            temp = unit.getCurrency() * 0.8888;
    }else if (unit instanceof Rubli){
            temp = unit.getCurrency() * 7.44;
        }else {
            temp = unit.getCurrency();
        }
        Euro euro = new Euro();
        euro.setCurrency(temp);
        return euro;
        }
}
