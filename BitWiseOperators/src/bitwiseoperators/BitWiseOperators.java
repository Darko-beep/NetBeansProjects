/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwiseoperators;

/**
 *
 * @author Darko Frederick
 */
public class BitWiseOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=60;/*60=00111100*/
        int b=13;/*13=00001101*/
        var c=0;
        c=a&b;/*12=0000111100*/
        System.out.println("a&b="+c);
        c=a|b;/*61=00111101*/
        System.out.println("a|b="+c);
        c=~a;/*-61=11000011*/
        System.out.print("~a="+c);
        c=a<<2;/*240=111100*/
        System.out.println("a<<2="+c);
        c=a>>2;/*15=1111*/
        System.out.println("a>>2="+c);
        c=a>>>2;/*15=0000 1111*/
        System.out.println("a>>>2="+c);
         
        
        
        
                }
    
}
