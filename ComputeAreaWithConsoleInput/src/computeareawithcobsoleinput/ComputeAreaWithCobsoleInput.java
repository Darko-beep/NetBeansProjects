/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeareawithcobsoleinput;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ComputeAreaWithCobsoleInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner object 
        Scanner input = new Scanner (System.in);
        //prompt the user to enter a radius 
        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();
        //compute area
        double area = radius * radius *3.14159;
        //Display the results 
        System.out.println("the Area of a Circle is "+ area);
        
        
    }
    
}
