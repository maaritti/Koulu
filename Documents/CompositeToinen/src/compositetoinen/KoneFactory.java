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
public class KoneFactory implements TietsikkaFactory{

    @Override
    public LaiteosaComposite createEmolevy() {
        return new Emolevy(100.00);
    }

    @Override
    public Laiteosa createProsessori() {
        return new Prosessori(200.00) {};
    }

    @Override
    public LaiteosaComposite createKotelo() {
        return new Kotelo(90);
    }

    @Override
    public Laiteosa createMuistipiiri() {
       return new Muistipiiri(20.50);
    }

    @Override
    public Laiteosa createVerkkokortti() {
         return new Verkkokortti(4.50);
    }

    @Override
    public Laiteosa createNaytonohjain() {
        return new Naytonohjain(722.00);
    }
    
}
