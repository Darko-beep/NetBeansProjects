/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradecomputation;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class GradeComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Grading system
         Scanner input = new Scanner (System.in);
         System.out.println ("What is your Scores");
    
         double score = input.nextDouble();
        if (score >= 60)
        System.out.println("D");
        else if (score >= 70)
        System.out.println("C");
        else if (score >= 80)
         System.out.println("B");
        else if (score >= 90)
        System.out.println("A");
        else
        System.out.println("F");
        
    }
    
}
