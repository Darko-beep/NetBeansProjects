/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class FarenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prompt the user to enter a Farenheit Value 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Farenheit value");
        double Farenheit = input.nextDouble();
        
        //compute the value
        double Celsius = (5.0/9)* (Farenheit-32);
        System.out.println( " the Farenheit value of " + Farenheit + "is" +
                Celsius );
    }
    
}
