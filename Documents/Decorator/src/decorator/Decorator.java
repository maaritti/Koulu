/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author maaritemilia
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataComponent data = new DataView();
        data.shownData();
        
        data = new CheckUsername(new CheckPassword(new DataView()));
        data.shownData();
    }
    }
    

