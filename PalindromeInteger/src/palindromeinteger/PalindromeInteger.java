/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromeinteger;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class PalindromeInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("A palindrome Integer is an integer that reads the same "
                + "from left to right "
                + "a negative integer is treated the same as a positive integer");
        System.out.println ("Enter your integers e.g 231");
        Scanner input = new Scanner (System.in);
        
       int Digit =input.nextInt();
      
       
       int firstDigit= Digit /100;
       int seconDigit= Digit /10 % 10;
       int thirdigit= Digit % 10;
        System.out.println("The Digits are : " +   firstDigit + "," +
         seconDigit + "," + thirdigit);
        System.out.println( firstDigit == thirdigit && seconDigit == seconDigit &&
               thirdigit == firstDigit ? "Integer is a palindrome" : "Digit is notpalindrome");
            
       
       
    }
    
}
