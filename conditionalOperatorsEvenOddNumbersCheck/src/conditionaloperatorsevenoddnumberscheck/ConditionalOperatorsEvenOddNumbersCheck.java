/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionaloperatorsevenoddnumberscheck;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ConditionalOperatorsEvenOddNumbersCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner 
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter your number to check Even or Odd e.g. 5 ");
        int number = input.nextInt();
        
        System.out.println("The number is : " + number);
        System.out.println((number % 2 == 0) ? " number is Even " : " number is Odd");
        /* 
        it reads "number is Even" if the modulo of the number 
        is = 0 else " Number is Odd"
        */
        
        
        
        
           
        
        
        
            
    }
    
}
