/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.pkgfinal;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hello
 */
public class AdminDashboardController implements Initializable {

    @FXML
    private TableView<Product> table;

    @FXML
    private TableColumn<Product, String> name;

    @FXML
    private TableColumn<Product, Double> price;

    @FXML
    private TableColumn<Product, Integer> id;

    @FXML
    private void onLogOutkButtonTap(ActionEvent event) throws IOException {
        Parent welcomePage = FXMLLoader.load(getClass().getResource("Welcome.fxml"));

        Scene welcomeScene = new Scene(welcomePage);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(welcomeScene);
        stage.show();
    }
    
    @FXML
    private void onAdminRegisterButtonTap(ActionEvent event) throws IOException {
        Parent welcomePage = FXMLLoader.load(getClass().getResource("CartDesign.fxml"));

        Scene welcomeScene = new Scene(welcomePage);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(welcomeScene);
        stage.show();
    }



//    public ObservableList<Product> getProduct(){
//        ObservableList<Product> products = FXCollections.observableArrayList();
//        products.add(new Product("Laptop", 859.00, 1));
//        products.add(new Product("Bouncy Ball", 2.49, 2));
//        products.add(new Product("Toilet", 99.00, 74));
//        products.add(new Product("The Notebook DVD", 19.99, 3));
//        products.add(new Product("Corn", 1.49, 4));
//        return products;
//    }
    ObservableList<Product> products = FXCollections.observableArrayList(
            new Product("Laptop", 85943.00, 1224),
            new Product("Bouncy Ball", 104.49, 2334),
            new Product("YoYo", 29, 2343),
            new Product("Story Book", 2.49, 1342),
            new Product("Monitor", 2.49, 2131),
            new Product("Macbook", 85943.00, 1224),
            new Product("Hp", 104.49, 2334),
            new Product("Desktop", 29, 2343),
            new Product("Coocking Book", 2.49, 1342),
            new Product("Mouse", 2.49, 2131),
            new Product("Keyboard", 85943.00, 1224),
            new Product("FootBall", 104.49, 2334),
            new Product("Hand Sanitizer", 29, 2343),
            new Product("Surgical Mask", 2.49, 1342),
            new Product("KN95 Mask", 2.49, 2131),
            new Product("Washing Machine", 85943.00, 1224),
            new Product("Fridge", 104.49, 2334),
            new Product("Gas Cylinder", 29, 2343),
            new Product("Thermomiter", 2.49, 1342),
            new Product("Napa Extra", 2.49, 2131),
            new Product("Mango", 85943.00, 1224),
            new Product("Jack Fruit", 104.49, 2334),
            new Product("Shirt", 29, 2343),
            new Product("Pant", 2.49, 1342),
            new Product("Burger", 2.49, 2131),
            new Product("Probook", 85943.00, 1224),
            new Product("Head Phone", 104.49, 2334),
            new Product("Cleaner", 29, 2343),
            new Product("Programming Book", 2.49, 1342),
            new Product("Printer", 2.49, 2131)
    );
    
    @FXML
    private TextField productNameTextField;
        private TextField productPriceTextField;
            private TextField productIdTextField;


    
    

    @FXML
    private void onAddProductButtonTap(ActionEvent event) {
        ObservableList<Product> products = FXCollections.observableArrayList(
            new Product(productNameTextField.getText(), Double.parseDouble(productPriceTextField.getText()) , Integer.parseInt(productIdTextField.getText()))
        );



    }
    
      @FXML
    private void onDeleteButtonTap(ActionEvent event) {
        ObservableList<Product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();

        productSelected.forEach(allProducts::remove);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        name.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        price.setCellValueFactory(new PropertyValueFactory<Product, Double>("price"));
        id.setCellValueFactory(new PropertyValueFactory<Product, Integer>("id"));

        table.setItems(products);
    }

}
