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
public class OldHand implements CharacterState{

    @Override
    public void attackHard() {
      System.out.println("You hit the enemy causing 100 damage!");

    }

    @Override
    public void dance() {
      System.out.println("You defended with your brass shield.");
    }

    @Override
    public void castSpell() {
        System.out.println("You cast a spell. It wreaks havoc on the enemy!");
    }

    @Override
    public void printState() {
        System.out.println("You have advanced to Advanced! You dominate!");
    }
    
}
