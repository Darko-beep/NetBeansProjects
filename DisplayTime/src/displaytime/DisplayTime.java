/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaytime;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class DisplayTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // prompt the user for input
        Scanner input = new Scanner (System.in);
        
        //Display prompt message 
        System.out.println("Enter an integer in seconds");
        
        //Declare variables
        int seconds = input.nextInt();
        int minutes = seconds / 60;//find the minutes in seconds 
        int remainingSeconds =  seconds % 60;//find the remaining seconds
        
        System.out.println( seconds + " seconds is " + minutes +
                " minutes and "+ remainingSeconds + " seconds " );
    }
    
}
