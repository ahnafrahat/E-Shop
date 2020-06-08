package eshop.pkgfinal;

import java.io.File;
import java.util.Scanner;



public class login {

    Scanner fileInput;

    boolean loggedIn = false;
    
    

  

    public login(String userName , String passWord , String filePath){
        
        
        String tempUsr = "";
        String tempPwd = "";
        
        try{
            
            fileInput = new Scanner(new File(filePath));
            fileInput.useDelimiter("[,\n]");
            
            while(fileInput.hasNext() && !loggedIn){
                tempUsr = fileInput.next();
                tempPwd = fileInput.next();
                
                if(tempUsr.trim().equals(userName.trim()) && tempPwd.trim().equals(passWord.trim())){
                   
                    loggedIn = true;
                    
                }
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            
        }
        
       
        
    }

   


}
