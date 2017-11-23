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
public class Advanced implements CharacterState {

    @Override
    public void attack() {
         System.out.println("You hit the enemy causing 100 damage!");
    }

    @Override
    public void defend() {
          System.out.println("You defended with your brass shield.");

    }

    @Override
    public void castSpell() {
        System.out.println("You cast a spell. It wreaks havoc on the enemy!");
    }

    @Override
    public void printState() {
       System.out.println("You cast a spell. It wreaks havoc on the enemy!");
    }

    @Override
    public void accept(CharacterStateVisitor visitor) {
       visitor.visit(this);

    }
    
}
