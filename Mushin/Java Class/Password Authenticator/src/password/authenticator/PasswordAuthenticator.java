/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package password.authenticator;

/**
 *
 * @author onyemauchechukwu
 */
import java.util.Scanner;
public class PasswordAuthenticator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("sign up,its free");
       
       Scanner input=new Scanner(System.in);
        /*allows you to input and save username*/
        
       System.out.println("key in your preffered username");
        String signupusername;                           
         signupusername=input.nextLine();
         
       /*allows you to input and save password*/
       
       System.out.println("key in your preffered password"); 
                     String signuppassword;
                     signuppassword=input.nextLine();
              
               System.out.println("sign up sucessfull");
               
               
               System.out.println("1-to sign in");
                 System.out.println("2-to exit");
                 String signin=input.next();
                 
                  switch(signin){
                      
                      case("1"):
        /*allows you to input your username*/
       System.out.println("key in your  username");
                 String signinusername;
         signinusername=input.nextLine();
           if(signinusername.equals(signupusername)){
                 System.out.println("key in your  password");
                 } else {
                      System.out.println("incorrect username");
    }
       /*allows you to input your password*/
       System.out.println("key in your  password"); 
                     String signinpassword;
                     signinpassword=input.nextLine();
                     if(signuppassword.equals(signinpassword)){
                 System.out.println("welcome");
                 } else {
                      System.out.println("incorrect password");
    }
                     break;
                     
                     case("2"):
                         
                  }
                                
    }
    
}
