/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author maaritemilia
 */
public class Koira extends AterioivaOtus{
     @Override
    public Juoma createJuoma() {
        return new Juice();
    }
}
