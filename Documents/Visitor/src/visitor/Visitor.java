/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author maaritemilia
 */
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final PlayerContext player = new PlayerContext();
        final CharacterStateVisitor visitor = new PlayerVisitor();
        
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
        System.out.println("");
        
        player.setState(new Intermediate());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
        System.out.println("");
        
        player.setState(new Advanced());
        player.printState();
        player.attack();
        player.defend();
        player.castSpell();
        player.accept(visitor);
    }
    
    
}
