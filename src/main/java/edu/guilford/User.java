package edu.guilford;

import java.util.Scanner;

public class User {

 // attributes
 private String firstName;
 private String lastName;
 private String email;
 private String petName;
 private String favColor;
 private String birthday;
 private String password;

 // constructor
 public passwordGenerator(String firstName, String lastName, String email, String petName, String favColor, String birthday) {

     this.firstName = firstName;
     this.lastName = lastName;
     this.email = email;
     this.petName = petName;
     this.favColor = favColor;
     this.birthday = birthday;
     this.password = petName.substring(0,2) + favColor.substring(0,2) + birthday.substring(0,2);
 }
    
    public String createPassword() {
        String password = firstName.substring(0,2) + lastName.substring(0,2) + email.substring(0,2) + petName.substring(0,2) + favColor.substring(0,2) + birthday.substring(0,2);
        return password;
    }

 // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;

    } 

    public void setEmail(String email) {
        this.email = email;
    }
 public String getPetName() {
     return petName;
 }

 public void setPetName(String petName) {
     this.petName = petName;
 }

 public String getFavColor() {
     return favColor;
 }

 public void setFavColor(String favColor) {
     this.favColor = favColor;
 }

 public String getBirthday() {
     return birthday;
 }

 public void setBirthday(String birthday) {
     this.birthday = birthday;
 }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 

    
}
