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
public class BossFactory implements ClothFactory{
   
  
    public Tpaita createTpaita() {
        return (Tpaita) new BossShirt();
    }

  

    public Kengat createKengat() {
        return (Kengat) new BossShoes();
    }

    public Housut createHousut() {
         return (Housut) new BossPants();
    }

  
    public Hattu createHattu() {
      return (Hattu) new BossHat();
    }
    
}
