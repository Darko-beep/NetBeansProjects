/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payincrease;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class PayIncrease {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // display a message 
        System.out.println ("Welcome User");
        System.out.println(" Enter your Score ");
        
        // Create a scanner 
        Scanner input = new Scanner (System.in);
        double Score = input.nextDouble();
        
        if (Score <90.0)
            System.out.println(" Your Salary is : " + Score * 30 /100);
        else 
           System.out.println (" Your Salary is : " + Score * 1/100); 
    }
    
}
