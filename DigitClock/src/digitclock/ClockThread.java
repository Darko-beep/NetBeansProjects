/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitclock;

import java.util.Date;

/**
 *
 * @author Darko
 */
public class ClockThread extends Thread{
    DigitClock dc;
    String time;
    
    public ClockThread(DigitClock dc) {
        this.dc= dc ;
        start();
    }
    
    public void run () {
        while (true) {
            time =" " + new Date();
            dc.jlabClock.setText(time);
            
        }
    }
       
}
