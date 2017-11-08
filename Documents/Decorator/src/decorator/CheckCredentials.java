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
public class CheckCredentials extends DataDecorator {
  private String username = "username";
    private String password = "password";
    private Scanner scanner = new Scanner(System.in);
    public CheckCredentials(DataComponent data) {
        super(data);
    }

    @Override
    public void shownData() {
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        if (!inputUsername.equals(username)) {
            System.out.println("No such username");
        } else {
            System.out.print("Password: ");
            String inputPassword = scanner.nextLine();
            if (inputPassword.equals(password)) {
                super.showData();
            } else {
                System.out.println("Incorrect password");
            }
        }
    }
    
}
