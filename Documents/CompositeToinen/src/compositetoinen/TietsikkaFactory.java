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
public interface TietsikkaFactory {
    public LaiteosaComposite createEmolevy();
    public Laiteosa createProsessori();
    public LaiteosaComposite createKotelo();
    public Laiteosa createMuistipiiri();
    public Laiteosa createVerkkokortti();
    public Laiteosa createNaytonohjain();

}
