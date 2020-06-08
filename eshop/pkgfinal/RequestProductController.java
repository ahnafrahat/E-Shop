/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.pkgfinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Formatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class RequestProductController implements Initializable {

   
    @FXML
    private TextField productTextField;
    private TextField productQuantityTextField;
    private TextField productTypeTextField;

    private Formatter fileWriter;
    private FileWriter filePath;
    
    public void requestedProduct(String productName , String quantity , String type){
             try {
            File check = new File("/Users/hello/Desktop/requestedProduct.txt");

            if (check.exists()) {
                filePath = new FileWriter("/Users/hello/Desktop/requestedProduct.txt", true);
                fileWriter = new Formatter(filePath);
                fileWriter.format("\n%s,%s,%s", productName, quantity , type);

                fileWriter.close();
           
                System.out.println("Register Complete");
            } else {

                fileWriter = new Formatter("/Users/hello/Desktop/requestedProduct.txt");
                fileWriter.format("\n%s,%s,%s", productName, quantity , type);

                fileWriter.close();
                System.out.println("New File Created");
              
            }

        } catch (IOException ex) {
            System.out.println(ex);
           
        }
        
    }
    
    
    @FXML
    private void onRequestButtonTap(ActionEvent event) throws IOException {
        requestedProduct(productTextField.getText(),productQuantityTextField.getText() ,  productTypeTextField.getText());
                Parent homePage = FXMLLoader.load(getClass().getResource("HomeDesign.fxml"));

        Scene homeScene = new Scene(homePage);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(homeScene);
        stage.show();
    }
    
    
    @FXML
    private void onBackButtonTap(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("HomeDesign.fxml"));

        Scene homeScene = new Scene(homePage);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(homeScene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
