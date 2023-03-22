/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package castingfloattointeger;

/**
 *
 * @author Darko Frederick
 */
public class CastingFloatToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare and the assign a value to f
        float f = 12.5f;
        int i = (int)f;
        double j = (double)f;
        byte k = (byte)f;
        long l = (long)f;
        System.out.println("f is " + f);
        System.out.println("f is " + i);
        System.out.println("f is " + k);
        System.out.println("f is " + i);
        
        // casting examples 
        double ans = 1.0 / 3.0;
        System.out.println(ans);
        float a = (float)ans;
        System.out.println(a);
        
        
    }
    
}
