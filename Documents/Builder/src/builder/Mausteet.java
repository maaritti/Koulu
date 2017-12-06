/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author maaritemilia
 */
public class Mausteet extends HampurgerBuild {

    @Override
    public void setPatties() {
         hamburger.setNoPatties(1);
    }

    @Override
    public void setKetchup() {
        hamburger.setHasKetchup(true);
    }

    @Override
    public void setMustard() {
         hamburger.setHasMustard(true); 
    }

    @Override
    public void setCheese() {
      hamburger.setHasCheese(true);
    }

    @Override
    public void setOnions() {
        hamburger.setHasOnions(true);
    }

    @Override
    public void setMayonayse() {
        hamburger.setHasMayonayse(true);
    }

    @Override
    public void setBrand() {
        hamburger.setBrand("Kaikilla Mausteilla Grilli");
 
    }
    
}
