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
public class MiddleAvarage implements CharacterState {

    @Override
    public void attackHard() {
        System.out.println("You hit the enemy causing 50 damage!");
    }

    @Override
    public void dance() {
        System.out.println("You defended with your wooden shield.");
    }

    @Override
    public void castSpell() {
        System.out.println("You cast a spell. It sets the enemy's hair on fire!");
    }

    @Override
    public void printState() {
       System.out.println("You are a not too bad Intermediate.");
    }
    
}
