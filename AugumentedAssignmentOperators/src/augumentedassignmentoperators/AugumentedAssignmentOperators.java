/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package augumentedassignmentoperators;

/**
 *
 * @author Darko Frederick
 */
public class AugumentedAssignmentOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* The operators +, -, *, /, and % can be combined with the assignment operator to form 
augmented operators.*/
        int a = 2;
        a += a + 1;  //a+a+1
        System.out.println(a);
       
        a = 6;
        a /= 2;  //a/2
        System.out.println(a);
            
        
    }
    
}
