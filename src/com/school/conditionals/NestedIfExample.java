package com.school.conditionals;

public class NestedIfExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        System.out.println("Age: " + age);
        System.out.println("Has ID: " + hasID);

        if (age >= 18){
            if (hasID == true){
                System.out.println("Access granted - welcome!");
            } else {
                System.out.println("You are old enough but need a valid ID.");
            }
        } else {
            System.out.println("Sorry, you must be 18 or older.");
        }
    }
}
