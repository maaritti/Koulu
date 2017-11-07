/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author maaritemilia
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        AbstractFactory factory = Factor.INSTANCE;
        factory.doSomething();
        factory.doSomethingElse();
        factory.setSomething("Something has changed!");
        
        AbstractFactory secondFactory = Factor.INSTANCE;
        secondFactory.doSomethingElse();
        secondFactory.doSomething();
    } 
    
}
