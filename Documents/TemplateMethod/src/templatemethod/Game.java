/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author maaritemilia
 */
public abstract class Game {
    
    abstract void initializeGame();
    abstract void makePlay();
    abstract boolean endOfGame();
    abstract void printWinner();
 
    /* A template method : */
    public final void playOneGame() {
        initializeGame();
        while (!endOfGame()) {
            makePlay();
        }
        printWinner();
    }
}
