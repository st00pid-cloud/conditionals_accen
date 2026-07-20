package com.school.conditionals;

public class LoginValidator {
    public static void main(String[] args) {
        String correctUser = "admin";
        String correctPass = "java123";
        String inputUser = "admin";
        String inputPass = "java123";

        if(inputUser == correctUser){
            if(inputPass == correctPass){
                System.out.println("Login successful! Welcome admin.");
            } else {
                System.out.print("Login failed. Invalid username or password.");
            }
        } else {
            System.out.print("Login failed. Invalid username or password.");
        }
    }
}