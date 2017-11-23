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
public interface CharacterStateVisitor {
    public void visit(Beginner beginner);
    public void visit(Intermediate intermediate);
    public void visit(Advanced advanced);
}

