package com.school.conditionals;

public class IfExample {
    public static void main(String[]args){
         double temperature = 38;
        if (temperature > 37){
            System.out.println("WARNING: You have a fever!");
        } else if (temperature < 35){
            System.out.println("YOU ARE FREEZING WHAT THE HECK");
        } else {
            System.out.println("Normal body temperature");
        }
        System.out.println("Your temperature is: " + temperature);
    }
}
