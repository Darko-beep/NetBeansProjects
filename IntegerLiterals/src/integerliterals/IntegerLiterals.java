/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integerliterals;

/**
 *
 * @author Darko Frederick
 */
public class IntegerLiterals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* By default, an integer literal is a decimal integer number. 
        To denote a binary integer literal, 
        use a leading 0b or 0B (zero B); 
        to denote an octal integer literal,
        use a leading 0 (zero); 
        and to denote a hexadecimal integer literal, 
        use a leading 0x or 0X (zero X). For 
        example*/
        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535
    }
    
}
