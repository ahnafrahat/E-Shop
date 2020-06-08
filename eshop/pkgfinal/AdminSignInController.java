/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.pkgfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hello
 */
public class AdminSignInController implements Initializable {

 @FXML
    private TextField userNameTextField;
    
    
    @FXML
    private PasswordField passwordField; 
    
    @FXML
    private void onSignInButtonTap(ActionEvent event) throws IOException {
//        if(){
//            
//        }

        login loginUser = new login(userNameTextField.getText(),passwordField.getText(),"/Users/hello/Desktop/admin.txt");
        
        System.out.println(loginUser.loggedIn);
        if(loginUser.loggedIn){
          Parent homePage = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
        
        Scene homeScene = new Scene(homePage);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(homeScene);
        stage.show();
        }else{
            System.out.println("Login Failed");
        }
    
        System.out.println(userNameTextField.getText());
        
        System.out.println(passwordField.getText());
    }
    
    
    @FXML
    private void onBackButtonTap(ActionEvent event) throws IOException{
            Parent welcomePage = FXMLLoader.load(getClass().getResource("Welcome.fxml"));
        
        Scene welcomeScene = new Scene(welcomePage);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(welcomeScene);
        stage.show();
    }
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
