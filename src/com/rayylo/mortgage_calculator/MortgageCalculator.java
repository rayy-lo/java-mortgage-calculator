package com.rayylo.mortgage_calculator;

import java.util.Scanner;

public class MortgageCalculator {
    public int principal;

    public float annualInterest;

    public byte amortizationPeriod;

    public void getMortgageInput(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Principal ($1K - $1M):");
            principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000 ");
        }

        while(true){
            System.out.print("Annual Interest Rate (%): ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest < 30)
                break;
            System.out.println("Enter a value greater than 0 and less than 30");
        }

        while(true){
            System.out.print("Period (Years): ");
            amortizationPeriod = scanner.nextByte();
            if(amortizationPeriod >= 1 && amortizationPeriod <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

    }

    public double calculateMortage(){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
        int totalPayments = amortizationPeriod * PERCENT;
        return principal * (monthlyInterest * Math.pow((1 + monthlyInterest), totalPayments)) / (Math.pow((1+monthlyInterest), totalPayments) - 1);
    }
}
