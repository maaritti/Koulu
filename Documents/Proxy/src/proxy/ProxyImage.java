/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author maaritemilia
 */
public class ProxyImage implements Image {
    
      private RealImage image = null;
    private String filename = null;
    
    public ProxyImage(final String FILENAME) { 
        filename = FILENAME; 
    }
 
    /**
     * Displays the image
     */

    @Override
    public void displayImage() {
           if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }



    @Override
    public void showData() {
       
        System.out.println("Image filename: " + filename);
    }
    
}
