/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computechangedollars;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ComputeChangeDollars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner (System.in);
        
        //Receive the amount
        System.out.println("Enter amount in double");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        
        //find the number of one dollars 
        int number0fOneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        //find the number of quarters in the remaining amount 
        int numberOfQuarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;
        
        //find the number of dimes in the remaining amount
        int numberODimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        //find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5; 
        remainingAmount = remainingAmount % 5;
        
        //find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        //display the results 
        System.out.println( " Your Amount " +  amount  + " consist of " );
        System.out.println(" " + number0fOneDollar  + " dollars ");
        System.out.println(" " + numberOfQuarters  + " dollars ");
        System.out.println(" " + numberODimes  + " dollars ");
        System.out.println(" " + numberOfNickels  + " dollars ");
        System.out.println(" " + numberOfPennies  + " dollars ");
        
        
               
        
        
    }
    
}
