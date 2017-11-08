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
public abstract class DataDecorator implements DataComponent{
     private DataComponent decoratedData;
    
    public DataDecorator(DataComponent data) {
        this.decoratedData = data;
    }

     public void showData() {
         decoratedData.shownData();
     }
  
}
