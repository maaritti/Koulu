/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author maaritemilia
 */
public class TimerOFClock extends Observable {
    private int hour, min, sec;
    private Timer timer = new Timer(true);
    private TimerTask tTask = new callTick(); 
      
        
    public TimerOFClock(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        timer.schedule(tTask, 0, 1000);
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
       private void tick() {
        sec++;
        if (sec >= 60) {
            sec = 0;
            min++;
        }
        if (min >= 60) {
            min = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
        setChanged();
        notifyObservers();
    }

    private class callTick extends TimerTask {


        @Override
        public void run() {
          tick();
        }
    }
}