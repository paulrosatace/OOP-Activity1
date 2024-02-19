/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.activity1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Activity1 {

    public static void main(String[] args) {
         Scanner nvm = new Scanner(System.in);
           System.out.println("What is your last name?");
           String lName = nvm.nextLine();
      
           System.out.println("What is your first name?");
           String fName = nvm.nextLine();
           
           System.out.println("What is your middle initial?");
           String mInitial = nvm.nextLine();
           
           System.out.println("What is your age?");
           String age = nvm.nextLine();
           
           System.out.println("What is your gender?");
           String gender = nvm.nextLine();
           
           System.out.println("What is your birthdate?");
          String birthdate = nvm.nextLine(); 

        System.out.println("\nPersonal Information:");
        System.out.println("Last Name: " + lName);
        System.out.println("First Name: " + fName);
        System.out.println("Middle Initial: " + mInitial);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Birthdate: " + birthdate);
    }
}
