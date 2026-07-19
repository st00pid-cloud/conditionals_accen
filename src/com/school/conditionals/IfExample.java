package com.school.conditionals;

public class IfExample {
    public static void main(String[]args){
         double temperature = 38.00;
        if (temperature > 37){
            System.out.println("WARNING: You have a fever!");
        }
        System.out.println("Your temperature is: " + temperature);
    }
}
