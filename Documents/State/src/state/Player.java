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
public class Player implements CharacterState {
    private CharacterState currentState;
    
    @Override
    public void attackHard() {
      currentState.attackHard();
    }

    public Player() {
        setState(new Beginner());
    }
    
     public void setState(final CharacterState newState) {
        currentState = newState;
     }

    @Override
    public void dance() {
     currentState.dance();;
    }

    @Override
    public void castSpell() {
       currentState.castSpell();
    }

    @Override
    public void printState() {
     currentState.printState();
    }
    
}
