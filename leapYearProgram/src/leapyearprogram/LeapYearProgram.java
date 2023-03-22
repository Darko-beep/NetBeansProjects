/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyearprogram;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class LeapYearProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a Year");
        int year = input.nextInt();
        
        //a leap year is divisble by 4
        boolean isLeapYear =(year % 4 == 0);
        //a leap year is divisible by 4 but not by 100 
        isLeapYear = isLeapYear && (year % 100 !=0);
        //a leap year is divisible by 4 but not by 100 or divisible by 400
        isLeapYear = isLeapYear || (year % 400 ==0);
       
        
        //Display the Results 
        System.out.println(year + " is a leap year " + isLeapYear );
    }
    
}
