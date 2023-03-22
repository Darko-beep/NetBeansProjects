/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Darko
 */
public class DigitClock extends JFrame {
    JLabel jlabClock;
    ClockThread ct;
    
    
    public DigitClock(){
    jlabClock  = new JLabel("");
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1200,120);
    setLocationRelativeTo(null);
    ct = new ClockThread(this);
    setVisible(true);
    add (jlabClock);
    jlabClock.setOpaque(true);
    jlabClock.setBackground(Color.cyan);
    jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE,50));
    jlabClock.setForeground(Color.black);
    
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // call the Method DigitClock
        new DigitClock ();
    }
    
}

