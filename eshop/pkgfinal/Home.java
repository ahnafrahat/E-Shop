//
//package eshop.pkgfinal;
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//
//public class Home extends Application implements EventHandler<ActionEvent>{
//    
//    Button button;
//    
//    public static void main(String[] args) {
//        
//       
//        
////        Register reg = new Register("Ahnaf","1234","ahnaf@gmail.com");
////        Register reg2 = new Register("Ahha","12345","ahnaf@gmail.com");
//      
//         launch(args);
//        
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//
//        primaryStage.setTitle("Home");
//        button = new Button();
//        button.setText("Check");
//        button.setOnAction(this);
//       
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout,500,600);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        
//    
//        
//        
//        
//    }
//
//    @Override
//    public void handle(ActionEvent event) {
//        if(event.getSource() == button){
//            login userLogin = new login("Ahnaf","1234","/Users/hello/Desktop/login.txt");
//             System.out.println(userLogin.loggedIn); 
//        }
//    }
//    
//}
