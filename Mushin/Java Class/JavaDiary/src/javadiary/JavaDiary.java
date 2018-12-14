/*
Written by Osoba Samuel Oluwaseun
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadiary;
import java.util.Scanner;

/**
 *
 * @author osoba1dasa
 */
public class JavaDiary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome!");
       String Account;
       System.out.println("Choose your account:\n1. Osoba Samuel Oluwaseun\n2. Aliko Dangote\n3. Warren Buffet\n4. Michael  George\n5. Nwankwo Sarah\n6. Pius Garkwa\n7. Robert Kiyosaki\n8. Create a new diary account\n");
       Account = input.nextLine();
       while (Account.equals("1")){
           String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Osoba Samuel Oluwaseun\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
          else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("2")){
            String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Aliko Dangote\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("3")){
           String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Warren Buffet\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("4")){
            String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Michael George\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("5")){
            String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Nwankwo Sarah\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
          System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
          else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("6")){
            String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Pius Garkwa\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       
       while (Account.equals("7")){
            String Edit, Edit_1, Password;
           System.out.println("Please input Password:\n");
           Password = input.nextLine();
           if (Password.equals("1234")){
           System.out.println("\nDiary: Welcome Robert Kiyosaki\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
           }
           else{
               System.out.println("Incorrect Password!");
               break;
           }
       }
       
       while (Account.equals("8")){
           String Name, Password;
           System.out.println("What is your name?");
           Name = input.nextLine();
           System.out.println("Choose a password:");
           Password = input.nextLine();
           String Edit, Edit_1;
           System.out.println("\n\t\tNew Account for " + Name + "has been created successfully!\nDiary: Welcome " + Name + "\n\tHow was your day today? Go ahead and write them all here:");
           Edit = input.nextLine();
           System.out.println("\nYou added this to your day:\n" + Edit + "\nDo you have any other thing to type in? \tYes/No");
           Edit_1 = input.nextLine();
           if (Edit_1.equalsIgnoreCase("Yes")){
               String Edit_2;
               System.out.println("Go ahead and take your time:\n");
               Edit_2 = input.nextLine();
               System.out.println("\nYou added this to your day:\n" + Edit_2 + "\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
               continue;  
           }
           else if (Edit_1.equalsIgnoreCase("No")){
               System.out.println("\nThank you. Your diary has just been updated! \nSee you later. \tGood Bye!");
           }
           else{
               System.out.println("Incorrect input!");
               break;
           }
       }
    }
    
}
