/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prompt the user to input 
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter purchase amount");
        double purchaseAmount = input.nextDouble();
        
        //compute the Tax amount 
        double tax = purchaseAmount * 0.06;
        System.out.println ("Sales tax is $" +  (int)(tax * 100) / 100.0);
        /* tax * 100 is 1185.3
        (int)(tax * 100) is 1185
        (int)(tax * 100) / 100.0 is 11.85 */
    }
    
}
