/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author maaritemilia
 */
public interface ClothFactory {
    
    public Housut createHousut();
    public Tpaita createTpaita();
    public Hattu  createHattu();
    public Kengat createKengat();
}
