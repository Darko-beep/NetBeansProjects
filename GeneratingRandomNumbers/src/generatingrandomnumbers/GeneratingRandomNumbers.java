/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generatingrandomnumbers;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class GeneratingRandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate the random nubers 
        int Random1 = (int)(Math.random() * 10);
        int Random2 = (int)(Math.random() * 10);
        /*
        A better approach is to use the random() method in the Math class.
        Invoking this method returns a random double value d such that within 0.0 to 1.0.
        Thus, (int)(Math.random() * 10) returns a random single-digit integer 
        (i.e., a number between 0 and 9).
        */
        // if number1 < number2 swap number1 with number2 
        if (Random1 < Random2) {
            int temp = Random1;
            Random1 = Random2;
            Random2 = temp;
            
        // prompt the student or user  to answer 
        System.out.println("What is " + Random1 + "-" + Random2 + "?");
        Scanner input = new Scanner (System.in);
        int answer = input.nextInt();
        
        //Grade the answer and Display the Results 
        if (Random1 - Random2 == answer)
            System.out.println("You are correct");
         System.out.println ( Random1  +  "-"  +  Random2  +
                 " should be " + ( Random1 - Random2 ) );
                
             }
         }
    }
    

