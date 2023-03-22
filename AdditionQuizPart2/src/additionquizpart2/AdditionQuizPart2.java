/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package additionquizpart2;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class AdditionQuizPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // assigning number 1 and number 2 top random values 
        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() / 10 % 10;
        
     //Create a Scanner 
        Scanner input = new Scanner (System.in);
        
        //Display the random computation 
        System.out.println(
        "What is  "  +  number1  +  "x"  +  number2  +  "?"  );
        
        //prompt the user to input an answer 
        int answer = input.nextInt();
        
        //Display the results 
        System.out.println ( number1 + "x" + number2 + "=" + answer + "is" + ( number1  *  number2  ==  answer ) );
        System.out.println ( number1  *  number2  ==  answer );
    }
    
}
