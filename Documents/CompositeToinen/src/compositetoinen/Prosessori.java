/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetoinen;

/**
 *
 * @author maaritemilia
 */
public class Prosessori implements Laiteosa{
    private double hinta;
    
    public Prosessori(double hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public double getHinta() {
        return hinta;
    }
    
}
