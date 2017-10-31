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
public class Kotelo implements LaiteosaComposite {
    public double hinta;
     private ArrayList<Laiteosa> kotelonOsat = new ArrayList<>();

    @Override
    public void addLaiteosa(Laiteosa osa) {
            if (!kotelonOsat.contains(osa)) {
            kotelonOsat.add(osa);
        }
        
    }

    public Kotelo(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
          double yhtHinta = this.hinta;
        for (Laiteosa laiteosa : kotelonOsat) {
            yhtHinta += laiteosa.getHinta();
        }
        return yhtHinta;
    }

    
}
