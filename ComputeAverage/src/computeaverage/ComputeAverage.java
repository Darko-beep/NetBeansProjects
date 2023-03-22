/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeaverage;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ComputeAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner object 
        Scanner input = new Scanner (System.in);
        
        
        // prompt the user to enter three numbers 
        System.out.println ("Enter three numbers:");
        double number = input.nextDouble();
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        
        
        // compute average 
        double average =(number + number1+ number2)/3;
        
        
        //display the results
        System.out.println("the average is :"+ average );
    }
    
}
