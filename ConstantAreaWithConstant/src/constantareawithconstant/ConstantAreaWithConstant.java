/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constantareawithconstant;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ConstantAreaWithConstant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare a constant
        final double PI = 3.14159;
        // import a scanner input 
        Scanner input = new Scanner (System.in);
        //prompt the user to add an input 
        System.out.println("Enter the radius");
        double radius = input.nextDouble();
        //compute area
        double area;
        area = radius * radius * PI;
        //display the results 
        System.out.println("The area for the circle of radius" + radius + "is" + area);
                
                
    }   
}
