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
public class AdduFactory implements ClothFactory {
    
   public Housut createHousut() {
       AdduPants pants = new AdduPants();
       return (Housut) pants;
   }
   public Tpaita createTpaita(){
       AdduShirt shirt = new AdduShirt();
       return (Tpaita) shirt;
   }
   public Kengat createKengat(){
       AdidasShoes shoes = new AdidasShoes();
       return (Kengat) shoes;
   }
   public Hattu createHattu(){
       AdduHat hat = new AdduHat();
       return (Hattu) hat;
   }
}
