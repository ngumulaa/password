package edu.guilford;

import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);

    // declare two new users
    User user1 = new User(); 
    User user2 = new User();

    // Ask for user1's information 
    System.out.println("Please enter your first name: ");
    user1.setFirstName(input.nextLine());

    System.out.println("Please enter your last name: ");
    user1.setLastName(input.nextLine());

    System.out.println("Please enter your email address: ");
    user1.setEmail(input.nextLine());

    System.out.println("What is the name of your favorite pet");
    user1.setPetName(input.nextLine());

    System.out.println("What is your favorite color?");
    user1.setFavColor(input.nextLine());

    System.out.println("What is your birthday?");
    user1.setBirthday(input.nextLine());


    // Ask for user2's information
    System.out.println("Please enter your first name: ");
    user2.setFirstName(input.nextLine());

    System.out.println("Please enter your last name: ");
    user2.setLastName(input.nextLine());

    System.out.println("Please enter your email address: ");
    user2.setEmail(input.nextLine());

    System.out.println("What is the name of your favorite pet");
    user2.setPetName(input.nextLine());

    System.out.println("What is your favorite color?");
    user2.setFavColor(input.nextLine());

    System.out.println("What is your birthday?");
    user2.setBirthday(input.nextLine());

    // Generate passwords for each user
    user1.setPassword(user1.createPassword());
    user2.setPassword(user2.createPassword());

    // Print out the passwords
    System.out.println("User 1's password is: " + user1.getPassword());
    System.out.println("User 2's password is: " + user2.getPassword());

    // ask each user for a secret key
    System.out.println("User 1, please enter your secret key: ");
    String key1 = input.nextLine();

    System.out.println("User 2, please enter your secret key: ");
    String key2 = input.nextLine();

    // print out the secret keys
    System.out.println("User 1's secret key is: " + key1);
    System.out.println("User 2's secret key is: " + key2);

    // create encrypted passwords using the secret key
    String encryptedPassword1 = AES.encrypt(user1.getPassword(), key1);
    String encryptedPassword2 = AES.encrypt(user2.getPassword(), key2);

    // print out the encrypted passwords
    System.out.println("User 1's encrypted password is: " + encryptedPassword1);
    System.out.println("User 2's encrypted password is: " + encryptedPassword2);

    // create decrypted passwords using the secret key
    String decryptedPassword1 = AES.decrypt(encryptedPassword1, key1);
    String decryptedPassword2 = AES.decrypt(encryptedPassword2, key2);

    // print out the decrypted passwords
    System.out.println("User 1's decrypted password is: " + decryptedPassword1);
    System.out.println("User 2's decrypted password is: " + decryptedPassword2);

}


}
