/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equalitytestoftwofloatingpoints;

/**
 *
 * @author Darko Frederick
 */
public class EqualityTestOfTwoFloatingPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration of variable 
        /*  The greek word epsilon represents and used to denote
        a very small value */
        final double EPSILON = 1E-14;  // constant EPSILON
        double x = 1.0-0.1-0.1-0.1-0.1-0.1;
        
        if (Math.abs(x-0.5) < EPSILON)
            System.out.println(x + " is approximately 0.5");
        /* the Math.abs(a) method can be used to return 
        the absolute value of a
        */
        
    }
    
}
