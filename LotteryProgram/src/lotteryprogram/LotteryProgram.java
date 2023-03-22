/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lotteryprogram;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class LotteryProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generate a lottery number 
        int lottery =(int)(Math.random() *100);
        
      
        //prompt the user to enter a guess 
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the lottery pick (two digits)");
        int guess = input.nextInt();
        
        //Get digits from lottery 
        int lotteryDigit1 = lottery /10;
        int lotteryDigit2 = lottery % 10;
        
        //get digits from the guess 
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        //display
        System.out.println("The lottery number is " + lottery);
        
        
        //check the guess 
        if (guess == lottery)
            System.out.println("Exact Match: yu win $10,000");
        else if (guessDigit2== lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all the Digits: yoy win $3.000");
        else if      ( guessDigit1 == lotteryDigit1
                    || guessDigit1 == lotteryDigit2 
                    || guessDigit2 == lotteryDigit1  
                    || guessDigit2 == lotteryDigit2)
             System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
        
        
        
        
    }
    
}
