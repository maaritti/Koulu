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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Hamburger hamburger = new BuilderSecond().getResult();
        System.out.println(hamburger);
        hamburger = new BuilderSecond().getResult();
        System.out.println(hamburger);
    }
    
}
