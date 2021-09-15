package com.rayylo.mortgage_calculator;

import java.util.Scanner;

public class MortgageCalculator {
    public int principal;

    public float annualInterest;

    public byte amortizationPeriod;

    public void getMortgageInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        principal = scanner.nextInt();
        System.out.print("Annual Interest Rate (%): ");
        annualInterest = scanner.nextFloat();
        System.out.print("Period (Years): ");
        amortizationPeriod = scanner.nextByte();
    }

    public double calculateMortage(){
        getMortgageInput();
        double monthlyInterest = (annualInterest / 100) / 12;
        int totalPayments = amortizationPeriod * 12;
        return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), totalPayments)) / (Math.pow((1+monthlyInterest), totalPayments) - 1);
    }
}
