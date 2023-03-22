 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testboooleanoperators;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class TestBoooleanOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creae a Scanner 
        // Create a Scanner
  Scanner input = new Scanner(System.in);
 
  // Receive an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); 

        if (number % 2 == 0 && number % 3 == 0){
        System.out.println(number + " is divisible by 2 and 3.");
        }
         if (number % 2 == 0 || number % 3 == 0){
        System.out.println(number + " is divisible by 2 or 3.");
         }
        if (number % 2 == 0 ^ number % 3 == 0){
        System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
        
        
    }
}  

