/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalclock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {
    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClock(){
        jlabClock  = new JLabel("");
        setLayout (new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Times New Roman", Font.CENTER_BASELINE,80));
        add(jlabClock);
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLUE);
        jlabClock.setForeground(Color.red);
        setSize(1200,200);
        setVisible(true);
        ct = new ClockThread(this);
        
    }

    public static void main(String[] args) {
        new DigitalClock();
        
    }
    
}
