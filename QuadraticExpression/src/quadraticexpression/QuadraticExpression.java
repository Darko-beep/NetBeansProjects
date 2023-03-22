/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraticexpression;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class QuadraticExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // display welcome message 
        System.out.println("Welcome user");
        System.out.println("calcaute the roots of the Quadratic Equation");
        System.out.println("Enter the co-efficients of x squared, x and constant c");
        
        //Display a Scanner 
        Scanner input = new Scanner (System.in);
        double a =input.nextDouble();
        double b =input.nextDouble();
        double c =input.nextDouble();
        
        
        double Discriminant =(double) ((Math.pow(b,2))-4*a*c);
        
      if (Discriminant>0)
          System.out.println("the Quadratic has two roots : " + -((Math.pow(Discriminant,0.5)+b )/2*a) + 
                  " and " + ((Math.pow(Discriminant,0.5)-b )/2*a));
          //System.out.println("R1 is : "  + (-b + (int)(Math.pow(Discriminant,0.5))/2*a));
          //System.out.println("R2 is : "  + (b + (int)(Math.pow(Discriminant,0.5))/2*a));
          
      if (Discriminant == 0) {
          System.out.println("the Quadratic has one roots");
           System.out.println("R1 is : "  + ((Math.pow(Discriminant,0.5)-b )/2*a));
      }
      
      else if (Discriminant <0){
          System.out.println("the Quadratic Expression has no roots");
          
      }
     
    }
    
}
