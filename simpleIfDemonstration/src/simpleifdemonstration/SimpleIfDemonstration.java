/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleifdemonstration;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class SimpleIfDemonstration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input =new Scanner (System.in);
        
        //Display output 
        System.out.println ("Enter any integer of your choice");
        
        //declare a variable and input 
        int num = input.nextInt();
        
        // if statement
        if (num % 5 == 0)
        System.out.println("Hi Five");
        
        if (num % 3 == 0){
        System.out.println("Hi There");
        }
        if (num % 2 == 0){
        System.out.println("Hi Even");
        }
        if (num % 2 == 0){
        System.out.println(num + " is even.");
        }
        else 
        System.out.println(num + " is odd."); 
        
        
        
    }
    
}
