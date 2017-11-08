package decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maaritemilia
 */
public class DataView implements DataComponent{
 private String[] data = {"Important", "data", "that", "exists", "here"};
    @Override
    public void shownData() {
             for (String string : data) {
            System.out.println(string);
        }
    }
    
    
}
