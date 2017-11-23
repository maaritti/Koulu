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
public class PlayerVisitor implements CharacterStateVisitor{

    @Override
    public void visit(Beginner beginner) {
               System.out.println("You receive 1 bonus point!");
    }

    @Override
    public void visit(Intermediate intermediate) {
        System.out.println("You receive 2 bonus points!");
    }

    @Override
    public void visit(Advanced advanced) {
         System.out.println("You receive 3 bonus points!");
    }
    
}
