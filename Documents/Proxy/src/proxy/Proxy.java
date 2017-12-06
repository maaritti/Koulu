/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maaritemilia
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                List<Image> images = new ArrayList<>();
        images.add(new ProxyImage("HiRes_10MB_Photo1"));
        images.add(new ProxyImage("HiRes_10MB_Photo2"));
        images.add(new ProxyImage("HiRes_10MB_Photo3"));
        images.add(new ProxyImage("HiRes_10MB_Photo4"));
        images.add(new ProxyImage("HiRes_10MB_Photo5"));
        images.add(new ProxyImage("LoRes_2MB_Photo1"));
        images.add(new ProxyImage("LoRes_2MB_Photo2"));

        for (Image image : images) {
            image.showData();
        }

        Scanner scanner = new Scanner(System.in);
        int pointer = 0;
        boolean running = true;
        System.out.println("Image Browser");
        while (running) {
            System.out.println("[1] prev [2] next [3] reload [4] show all [5] exit");
            System.out.println("You are at: " + pointer);
            System.out.print("> ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    pointer--;
                    if (pointer < 0) {
                        pointer = 0;
                    } else {
                        images.get(pointer).displayImage();
                    }
                    break;
                case "2":
                    pointer++;
                    if (pointer > images.size() - 1) {
                        pointer = images.size();
                    } else {
                        images.get(pointer).displayImage();
                    }
                    break;
                case "3":
                    images.get(pointer).displayImage();
                    break;
                case "4":
                    for (Image image : images) {
                        image.displayImage();
                    }
                    break;
                case "5":
                    running = false;
                    break;
            }
        }
    }
    
}
