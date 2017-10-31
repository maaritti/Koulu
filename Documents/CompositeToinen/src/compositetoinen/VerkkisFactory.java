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
public class VerkkisFactory implements TietsikkaFactory {

    @Override
    public LaiteosaComposite createEmolevy() {
        return new VerkkisEmolevy();
    }

    @Override
    public Laiteosa createProsessori() {
       return new VerkkisProssessori();
    }

    @Override
    public LaiteosaComposite createKotelo() {
      return new VerkkisKotelo();
    }

    @Override
    public Laiteosa createMuistipiiri() {
        return new VerkkisMuistipiiri();
    }

    @Override
    public Laiteosa createVerkkokortti() {
        return new VerkkisVerkkokortti();
    }

    @Override
    public Laiteosa createNaytonohjain() {
        return new VerkkisNaytonOhjain();
    }
    
}
