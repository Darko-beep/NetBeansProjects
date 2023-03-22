/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeloansjava;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ComputeLoansJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* prompt the user to enter the annual 
        interest rate, number of years, loan amount*/
        
        Scanner input = new Scanner (System.in);
        
        //ENTER THE ANNUAL INTEREST RATE IN %
        System.out.println("ENTER THE ANNUAL INTEREST RATE");
        double annualInterestRate =input.nextDouble();
        
        //ENTER THE NUMBER OF YEARS 
        System.out.println("ENTER THE NUMBER OF YEARS");
        int numberOfYears = input.nextInt();
        
        //ENTER THE NUMBER LOAN AMOUNT 
        System.out.println("ENTER THE LOAN AMOUNT");
        double loanAmount = input.nextDouble();
            
        /*obtain monthly interest rate from 
        the annual interest rate */
        System.out.println("the Annual Interest Rate is;" + annualInterestRate);
        double monthlyInterestRate = annualInterestRate / 1200;
        System.out.println("the Monthly Interest Rate is;" + monthlyInterestRate);
        
        //Calculate 
        double monthlyPayment =loanAmount * monthlyInterestRate /(
        1-1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
        
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        //Display the results 
        System.out.println("the monthly payment is $" +
                (int)(monthlyPayment * 100)/100.0);
        System.out.println("the total payment is $" +
                (int)(totalPayment  * 100)/100.0);
        
       
        
        
    }
    
}
