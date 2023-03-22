/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package castingboolean;

/**
 *
 * @author Darko Frederick
 */
public class CastingBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // casting of boolean to integer
        boolean b = true;
        double i;
        i = (int)b;
        System.out.println(i);
        /* error: incompatible types: boolean cannot be converted to int
        i = (int)b; */
        
        int i = 1;
        boolean b = (boolean)i; 
        
        /* error: incompatible types: int cannot be converted to boolean
        boolean b = (boolean)i; */

    }
    
}
