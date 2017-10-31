/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetoinen;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author maaritemilia
 */
public class Emolevy implements LaiteosaComposite {
    private double hinta;
    private ArrayList<Laiteosa> emolevynOsat = new ArrayList<>();

    public Emolevy(double hinta) {
        this.hinta = hinta;
    }

    public double getHinta() {
         double yhtHinta = this.hinta;
        for (Laiteosa laiteosa : emolevynOsat) {
            yhtHinta += laiteosa.getHinta();
        }
        return yhtHinta;
    }
    
    public void addLaiteosa(Laiteosa osa){
         if (!emolevynOsat.contains(osa)) {
            emolevynOsat.add(osa);
        }
    }
            
}
