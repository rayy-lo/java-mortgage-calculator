package com.rayylo.mortgage_calculator;

import java.util.Scanner;

public class MortgageCalculator {
    public int principal;

    public float interest;

    public byte amortizationPeriod;

    private float monthlyPayment;

    public void getMortgageInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        principal = scanner.nextInt();
        System.out.println(principal);
    }
}
