/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop.pkgfinal;

//import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Register {

    boolean IsRegistered = false;
    private Formatter fileWriter;
    private FileWriter filePath;
    
    private Formatter dataWriter;
    private FileWriter dataPath;

    public Register(String userName, String PassWord, String email) {
        try {
            File check = new File("/Users/hello/Desktop/login.txt");

            if (check.exists()) {
                filePath = new FileWriter("/Users/hello/Desktop/login.txt", true);
                fileWriter = new Formatter(filePath);
                fileWriter.format("\n%s,%s", userName, PassWord);

                fileWriter.close();
                IsRegistered = true;
                System.out.println("Register Complete");
            } else {

                fileWriter = new Formatter("/Users/hello/Desktop/login.txt");
                fileWriter.format("%s,%s", userName, PassWord);

                fileWriter.close();
                System.out.println("New File Created");
                IsRegistered = true;
            }

        } catch (IOException ex) {
            System.out.println(ex);
            IsRegistered = false;
        }

      try {
            File check = new File("/Users/hello/Desktop/userData.txt");

            if (check.exists()) {
                dataPath = new FileWriter("/Users/hello/Desktop/userData.txt", true);
                dataWriter = new Formatter(dataPath);
                dataWriter.format("\n%s,%s", userName, PassWord);

                dataWriter.close();
                
                System.out.println("Register Complete");
            } else {

                dataWriter = new Formatter("/Users/hello/Desktop/userData.txt");
                dataWriter.format("%s\n%s\n%s", userName, PassWord , email);
                dataWriter.format("\n");

                dataWriter.close();
                System.out.println("New File Created");
              
            }

        } catch (IOException ex) {
            System.out.println(ex);
            
        }
    }

}
