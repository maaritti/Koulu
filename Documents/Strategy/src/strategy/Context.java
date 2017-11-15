/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author maaritemilia
 */
public class Context {
    
        private SortStrategy strategy;
 
    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }
 
    public void executeStrategy(int a[]) {
        try {
            this.strategy.sort(a);
        } catch (Exception ex) {
            System.out.println("error " + ex.getMessage());
        }
    }

    
}
