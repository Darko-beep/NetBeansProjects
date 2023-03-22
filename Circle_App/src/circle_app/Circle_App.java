 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_app;

import static java.lang.Integer.valueOf;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Circle_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<integer> numbers = new ArrayList();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display element");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            System.out.print("===>");
            
            int choice = input.nextInt();
            if(choice == 1){
                System.out.print("Enter a number to add: ");
                numbers.add(input.nextInt());
            }
        }
    }
    
}