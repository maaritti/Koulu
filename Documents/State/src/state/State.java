/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author maaritemilia
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         final Player player = new Player();
        
        player.printState();
        player.attackHard();
        player.dance();
        player.castSpell();
        System.out.println("");
        
        player.setState(new MiddleAvarage());
        player.printState();
        player.attackHard();
        player.dance();
        player.castSpell();
        System.out.println("");
        
        player.setState(new OldHand());
        player.printState();
        player.attackHard();
        player.dance();
        player.castSpell();
    }
    
}
