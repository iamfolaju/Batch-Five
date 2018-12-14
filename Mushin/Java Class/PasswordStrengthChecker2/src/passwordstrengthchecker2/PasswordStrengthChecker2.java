/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrengthchecker2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Oyekunle Ayooluwa
 */
public class PasswordStrengthChecker2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VerifyContent srini= new VerifyContent();
        System.out.println("Hello..........");
        System.out.println("This is my Password Strength Checker");
        System.out.println("Use it to know if your password is secure enough to ensure confidentiality of information");
        System.out.println("The password must be between 7 and 13 (8-12)");
        System.out.println("Note: For a secure password, it must contain 3/4 of the following characters:");
        System.out.println("      1. Atleast one uppecase letter");
        System.out.println("      2. Atleast one locercase letter");
        System.out.println("      3. Atleast one number");
        System.out.println("      4. Atleast one special character ->'@#$%^&+=/?!'");
        System.out.println("It must also be noted that for this type of password, white spacing is not allowed");
        System.out.println("");
        Scanner pass = new Scanner(System.in);
        String Password;
        System.out.print("Enter the password to be evaluated: ");
        srini.Password=pass.nextLine();
        Password=srini.Password;
        while(Password.length()==0){
            System.out.println("There was no input");
            System.out.println("You must input a password for it to be evaluated");
            System.out.println("");
            Scanner pass1 = new Scanner(System.in);
            System.out.print("Enter the password to be evaluated: ");
            srini.Password=pass.nextLine();
        }
        while(Password.length()<8){
            System.out.println("Password is too short");
            System.out.println("Input another password-->");
            Scanner pass1 = new Scanner(System.in);
            System.out.print("Enter the password to be evaluated: ");
            Password=pass1.next();
            
        }
        while(Password.length()>12){
            System.out.println("Password is too long");
            System.out.println("Input another password that will be easier to recall");
            System.out.println("");
            Scanner pass1 = new Scanner(System.in);
            System.out.print("Enter the password to be evaluated: ");
            Password=pass1.next();
            
        }
        System.out.println("");
        System.out.println("Evaluating........");
        System.out.println("");
        srini.Check();
        System.out.println("");
        
        System.out.println("Password Strength Check Terminated");
            
        
    }
public static class VerifyContent{
    String Password;
    void Check(){
        boolean hasDigit=false;
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasSpecialCharacter=false;
        for (int i = 0; i < Password.length(); i++) {
            char x = Password.charAt(i);
            if (Character.isLetter(x)) {
                if (Character.isLowerCase(x)){
                    hasLowerCase = true;

                }
                else if(Character.isUpperCase(x)){
                    hasUpperCase = true;
                }

            }

            else if (Character.isDigit(x)) {

                hasDigit = true;
            }
            else if(isSpecialCharacter(x)){
                hasSpecialCharacter=true;

            }

        }
        if ( hasDigit && hasUpperCase && hasLowerCase && hasSpecialCharacter){
            System.out.println("Password has a strength level of 100%");
            System.out.println("All the characters are present");
            System.out.println("It is VERY STRONG");
        }
        else if ( hasDigit && hasUpperCase && hasLowerCase || hasUpperCase && hasLowerCase && hasSpecialCharacter ) {
            System.out.println("Password has a strength level of 75%");
            System.out.println("3 out of 4 of the characters are present");
            System.out.println("It is STRONG");
            
        } else if(hasDigit && hasLowerCase && hasSpecialCharacter || hasDigit && hasUpperCase && hasSpecialCharacter){
            System.out.println("Password has a strength level of 75%");
            System.out.println("3 out of 4 of the characters are present");
            System.out.println("It is STRONG");
            
        }
        else if(hasDigit && hasUpperCase || hasDigit && hasLowerCase || hasDigit && hasSpecialCharacter ){
            System.out.println("Password has a strength level of 50%");
            System.out.println("2 out of 4 of the characters are present");
            System.out.println("It is AVERAGE");
            System.out.println("It is advisable to use a stronger password");
        }
        else if(hasUpperCase && hasLowerCase || hasUpperCase && hasSpecialCharacter || hasLowerCase && hasSpecialCharacter  ){
            System.out.println("Password has a strength level of 50%");
            System.out.println("2 out of 4 of the characters are present");
            System.out.println("It is AVERAGE");
            System.out.println("It is advisable to use a stronger password");
        }
        else if(hasDigit || hasUpperCase || hasLowerCase || hasSpecialCharacter){
            System.out.println("Password has a strength level of 25%");
            System.out.println("only 1 out of 4 of the characters are present");
            System.out.println("It is a WEAK password");
            System.out.println("It is advisable to use a stronger password");
        }
    }
    private boolean isSpecialCharacter(Character x)
    {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(Password);
        boolean check=false;
        while(m.find()){
            check= true;
            break;
        }
        return check;
    }
}
}
