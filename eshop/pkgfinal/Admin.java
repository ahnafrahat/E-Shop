
package eshop.pkgfinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Admin {

    boolean IsRegistered = false;
    private Formatter fileWriter;
    private FileWriter filePath;
    
    private Formatter dataWriter;
    private FileWriter dataPath;

    public Admin(String userName, String PassWord, String email) {
        try {
            File check = new File("/Users/hello/Desktop/admin.txt");

            if (check.exists()) {
                filePath = new FileWriter("/Users/hello/Desktop/admin.txt", true);
                fileWriter = new Formatter(filePath);
                fileWriter.format("\n%s,%s", userName, PassWord);

                fileWriter.close();
                IsRegistered = true;
                System.out.println("Register Complete");
            } else {

                fileWriter = new Formatter("/Users/hello/Desktop/admin.txt");
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
            File check = new File("/Users/hello/Desktop/adminData.txt");

            if (check.exists()) {
                dataPath = new FileWriter("/Users/hello/Desktop/adminData.txt", true);
                dataWriter = new Formatter(dataPath);
                dataWriter.format("\n%s,%s", userName, PassWord);

                dataWriter.close();
                
                System.out.println("Register Complete");
            } else {

                dataWriter = new Formatter("/Users/hello/Desktop/adminData.txt");
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