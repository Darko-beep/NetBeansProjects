/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumeoftriangle;

import java.util.Scanner;

/**
 *
 * @author Darko Frederick
 */
public class VolumeOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Volume a Triangle **/
    Scanner input = new Scanner(System.in);
    
    //declaration of variable and assigning 
    //call for the input of the user 
    System.out.println("Enter the length eg. 5cm");
    float lengthOfSide = input.nextFloat();
    
   
    //compute the Area of the Triangle
    double Area;
     Area =  ((Math.pow(3.0,0.5)/4) * (Math.pow(lengthOfSide,2)));
     System.out.println(" The Area of Traingle is " + Area );
   
     double Volume =  (Area * lengthOfSide) ;
    //display the results of the Area 
    System.out.println(" the Volume of the Triangle is " +
            Volume );
    
    
   
    }
    
}
