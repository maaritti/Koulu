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
public enum Factor implements AbstractFactory {
    INSTANCE;
    
    private String something = "Something";

    @Override
    public void doSomething() {
      System.out.println(something);
    }

    @Override
    public void doSomethingElse() {
      System.out.println("Something else");
    }

    @Override
    public void setSomething(String newSomething) {
        something = newSomething; 
    }
    
    
}
