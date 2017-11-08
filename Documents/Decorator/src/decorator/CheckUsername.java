/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author maaritemilia
 */
public class CheckUsername extends DataDecorator {
    private String username = "username";
    private Scanner scanner = new Scanner(System.in);

    public CheckUsername(DataComponent data) {
        super(data);
    }
    @Override
    public void shownData() {
        
             System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        if (inputUsername.equals(username)) {
            super.showData();            
        } else {
            System.out.println("No such username");
        }
    
    }
}
