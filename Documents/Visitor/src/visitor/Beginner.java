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
public class Beginner implements CharacterState{

    @Override
    public void attack() {
         System.out.println("You hit the enemy causing 10 damage!");
    }

    @Override
    public void defend() {
     System.out.println("You defended with your bare hands.");
    }

    @Override
    public void castSpell() {
       System.out.println("You cast a spell. It made a silent popping noise.");
    }

    @Override
    public void printState() {
     
  System.out.println("You are a puny Beginner.");
    }

    @Override
    public void accept(CharacterStateVisitor visitor) {
        visitor.visit(this);
    }
    
}
