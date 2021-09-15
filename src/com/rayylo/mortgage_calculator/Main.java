package com.rayylo.mortgage_calculator;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        MortgageCalculator calc = new MortgageCalculator();
        double unformattedPayment = calc.calculateMortage();
        Locale locale = new Locale("en", "US");
        System.out.println(NumberFormat.getCurrencyInstance(locale).format(unformattedPayment));
    }
}
