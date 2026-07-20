package com.school.conditionals;

public class GradeChecker {
    public static void main(String[] args) {
        double average = 88.5;

        System.out.println("Average: " + average);

        if(average >=97.00){
            System.out.println("Grade: 1.00");
        } else if(average >= 94.00){
            System.out.println("Grade: 1.25");
        } else if(average >= 91.00){
            System.out.println("Grade: 1.50");
        } else if(average >= 88.00){
            System.out.println("Grade: 1.75");
        } else if(average >= 85.00){
            System.out.println("Grade: 2.00");
        } else if(average >= 82.00){
            System.out.println("Grade: 2.25");
        } else if(average >= 79.00){
            System.out.println("Grade: 2.50");
        } else if (average >= 76.00){
            System.out.println("Grade: 2.75");
        } else if (average == 75.00){
            System.out.println("Grade: 3.00");
        } else {
            System.out.println("Grade: 5.00 (Failed)");
        }
    }
}
