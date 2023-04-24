package edu.guilford;

import java.util.Scanner;

public class User {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        // Ask for user information 
        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("Please enter your email address: ");
        String email = input.nextLine();

        System.out.println("Please enter your username: ");
        String username = input.nextLine();

        // Generate password
        String password = generatePassword(input); 

        //Print out your information and generate password 
        System.out.println("\nHello " + firstName + " " + lastName + "!");
        System.out.println("Your email address is: " + email);
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + password);
    }

    public static String askForInput(Scanner input, String message) {
        System.out.println(message);
        return input.nextLine();
    }

    public static String generatePassword(Scanner input) {
      System.out.println("\nLet's create a password!"); 
      String petName = askForInput(input, "What is the name of your favorite pet?");
      String favColor = askForInput(input, "What is your favorite color?");
      String birthday = askForInput(input, "What is your birthday? (MMDDYYYY)");

      String password = petName.substring(0,2)  + favColor.substring(0,2) + birthday.substring(0,2);
       
      // return password;
      String secretKey = "Secret"; 
      String encryptedPassword = AES.encrypt(password, secretKey);
      return encryptedPassword;
    }



    
}
