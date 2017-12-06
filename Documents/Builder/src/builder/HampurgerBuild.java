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
public abstract  class HampurgerBuild {
     protected Hamburger hamburger;
    public Hamburger getResult() {
        hamburger = new Hamburger();
        setBrand();
        setCheese();
        setKetchup();
        setMayonayse();
        setMustard();
        setOnions();
        setPatties();
        return hamburger;
    }
    public abstract void setPatties();
    public abstract void setKetchup();
    public abstract void setMustard();
    public abstract void setCheese();
    public abstract void setOnions();
    public abstract void setMayonayse();
    public abstract void setBrand();
}
