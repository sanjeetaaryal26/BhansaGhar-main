/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhansaghar;

import view.HomeScreen;
import view.LoginScreen;

/**
 *
 * @author Nishan Giri
 *Sanjeeta Aryal
 *Ritika Shrestha
 * Sujal Silwal (Git Tester)
 */
public class BhansaGhar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginScreen mainFrame = new LoginScreen();
//HomeScreen mainFrame = new HomeScreen();

mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(LoginScreen.EXIT_ON_CLOSE);
      
    }
    
}
