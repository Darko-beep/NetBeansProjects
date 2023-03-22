/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package z.x.y_calculation;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class ZXY_Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //assign x and y
        Scanner input = new Scanner (System.in);
        
        System.out.println("input x and y values");
        int x = input.nextInt();
        int y = input.nextInt();
       if (x > 2) {
            if (y > 2) {
              int  z = x + y;
                System.out.println("z is " + z);
             }
           }
        else
            System.out.println("x is " + x );
                       
    }        
  }
