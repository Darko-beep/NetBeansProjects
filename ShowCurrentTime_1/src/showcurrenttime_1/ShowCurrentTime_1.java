/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package showcurrenttime_1;

/**
 *
 * @author Darko Frederick
 */
public class ShowCurrentTime_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //obtain the miliseconds since midnight jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        //obtain the total seconds since midnight , jan 1, 1970
        long totalSeconds = totalMilliseconds /1000;
        
        //compute the current second in the minute in the hour 
        long currentSecond = totalSeconds % 60;
        
        //obtain the total the minutes 
        long totalMinutes =totalSeconds /60;
        
        //compute the minute in the hour 
        long currentMinute = totalMinutes % 60;
        
        //obtain the total hours 
        long totalhours = totalMinutes / 60;
        
        //compute the current hour 
        long currentHour = totalhours % 24;
        
        //display the results 
        System.out.println( "current time is " + currentHour +":"+
              currentMinute + ":" + currentSecond + "GMT");
    }
    
}
