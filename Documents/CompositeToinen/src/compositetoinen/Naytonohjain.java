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
public class Naytonohjain implements Laiteosa {
    
    public double hinta;
    
    public Naytonohjain(double hinta) {
        this.hinta = hinta;
    }
    @Override
    public double getHinta() {
      return hinta;
    }
   
}
