/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author maaritemilia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimerOFClock subjectClock = new TimerOFClock(20, 17, 30);
        DigiClock digitalClock = new DigiClock(subjectClock);
        while (true){            
        }
    } 
    
    
}
