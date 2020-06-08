/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.pkgfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author hello
 */
public class WelcomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    
    @FXML
    private void onSignInButtonTap(ActionEvent event) throws IOException{
        System.out.println("SignInButoonTapped");
         Parent loginPage = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        
        Scene loginScene = new Scene(loginPage);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(loginScene);
        stage.show();
        
    }
    
     @FXML
    private void onRegistrationButtonTap(ActionEvent event) throws IOException {
         System.out.println("RegisterButtonTapped");
           Parent loginPage = FXMLLoader.load(getClass().getResource("Registration.fxml"));
        
        Scene loginScene = new Scene(loginPage);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(loginScene);
        stage.show();
    }
    
     @FXML
    private void onAdminLoginButtonTap(ActionEvent event) throws IOException {
         System.out.println("AdminLoginButtonTapped");
           Parent loginPage = FXMLLoader.load(getClass().getResource("AdminSignIn.fxml"));
        
        Scene loginScene = new Scene(loginPage);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(loginScene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
}
