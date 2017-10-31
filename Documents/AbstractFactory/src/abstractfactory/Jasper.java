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
public class Jasper {
    
    private Housut housut;
    private Kengat kengat;
    private Hattu lippis;
    private Tpaita tpaita;
    
    public Jasper(ClothFactory clothTehdas) {
        housut = clothTehdas.createHousut();
        kengat = clothTehdas.createKengat();
        lippis = clothTehdas.createHattu();
        tpaita = clothTehdas.createTpaita();
    }
    
    @Override
    public String toString() {
        String tulostus = "Päälläni on: \n";
        
        tulostus += housut + "\n";
        tulostus += kengat + "\n";
        tulostus += lippis + "\n";
        tulostus += tpaita + "\n";
        
        return tulostus;
    }
}
    

