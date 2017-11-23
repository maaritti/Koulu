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
public interface CharacterState {
    public void attack();
    public void defend();
    public void castSpell();
    public void printState();
    public void accept(CharacterStateVisitor visitor);
}
