/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplythedigitsinanintegers;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class MultiplyTheDigitsInAnIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //prompt the user to enter the desired amount 
        System.out.println("Enter the desired integer between 0 to 1000");
        int Integer_value =input.nextInt();
        
        // deriving the digits for the desired integer
        int firstNum1 = Integer_value / 100;
        int secondNum2 = Integer_value / 10 % 10;
        int thirdNum3 = Integer_value % 10;
        System.out.println(firstNum1);
        System.out.println(secondNum2);
        System.out.println(thirdNum3);
        
        //computing the multiplication 
        System.out.println ("The multiplication of all digits in " + Integer_value + " is " + 
              firstNum1 * secondNum2 * thirdNum3);
        
    }
    
}
