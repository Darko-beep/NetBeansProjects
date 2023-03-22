/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertmiletokilometer;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ConvertMileToKilometer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a program to convert miles to kilometers 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles traveled eg. 50 miles");
        double value = input.nextDouble();
        final double kilometers = 1.6;
        double mile = kilometers * value ;
        // display the results 
        System.out.println(value + " is approximately " + (int)(mile*100)/100 + " kilometers ");
       
       
        
    }
    
}
