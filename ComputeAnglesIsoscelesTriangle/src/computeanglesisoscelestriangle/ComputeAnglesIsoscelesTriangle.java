/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computeanglesisoscelestriangle;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ComputeAnglesIsoscelesTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //welcome User 
        System.out.println("Welcome User");
        System.out.println("Enter the coordinates of the three points seperated  + "
                + " by spaces like x1 y1 x2 y2 x3 y3 ");
        System.out.println("Enter the three points");
        
        //create a scanner 
        Scanner input = new Scanner (System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        //compute for the sides 
        double a = Math.sqrt((x2-x3) * (x2-x3)+(y2-y3) *(y2-y3));
        double b = Math.sqrt((x1-x3) * (x1-x3)+(y1-y3) *(y1-y3));
        double c = Math.sqrt((x1-x2) * (x1-x2)+(y1-y2) *(y1-y2));
        
        //compute the three angles using the formulae 
        double A = Math.toDegrees (Math.acos( (a*a-b*b-c*c) / (-2*b*c)));
        double B = Math.toDegrees (Math.acos( (b*b-a*a-c*c) / (-2*a*c)));
        double C = Math.toDegrees (Math.acos( (c*c-b*b-a*a) / (-2*a*b)));
        
        //Display the results 
        System.out.println("The three angles are : " + 
                Math.round(A * 100) / 100 + " " +
                Math.round(B * 100) / 100 + " " +
                Math.round(C * 100) / 100);
        
        
    }
    
}
