/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicaloperatorssample;

/**
 *
 * @author Darko Frederick
 */
public class LogicalOperatorsSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a Scanner and prompt the user 
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("check the eligibility of x, y, and z");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        
        
        System.out.println("(x<y && y<z) is " + 
                (x<y && y<z));
        System.out.println("(x<y || y<z) is " + 
                (x<y || y<z));
        System.out.println("(x<y) is " + !(x<y));
        System.out.println("(x+y<z) is " + (x+y<z));
        System.out.println("(x+y>z) is " + (x+y>z));
    }
    
    
}
