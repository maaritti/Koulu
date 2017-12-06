/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Scanner;

/**
 *
 * @author maaritemilia
 */
public class Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner scanner = new Scanner(System.in);
        boolean endOfGame = false;
        
        Quiz quizzer = new Quiz();
        Object obj = quizzer.joinGame();
        
        while (!endOfGame) {
            int guess = Integer.parseInt(scanner.nextLine());
            endOfGame = quizzer.makeGuess(obj, guess);
        }
        
    }
    
    
}
