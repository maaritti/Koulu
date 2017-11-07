/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author maaritemilia
 */
public class DigiClock implements Observer  {
    private TimerOFClock subject;
    
    
   public DigiClock(TimerOFClock subjectClock) {
        subject = subjectClock;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (subject == o) {
            formatTime();
        }
    }
    
    private void formatTime() {        
        int hour = subject.getHour();
        int min = subject.getMin();
        int sec = subject.getSec();
        String printOut = "";
        
        if (hour < 10) {
            printOut += "0" + hour + ":";
        } else {
            printOut += "" + hour + ":";
        }
        if (min < 10) {
            printOut += "0" + min + ":";
        } else {
            printOut += "" + min + ":";
        }
        if (sec < 10) {
            printOut += "0" + sec;
        } else {
            printOut += "" + sec;
        }        
        System.out.println(printOut);
    }

}
