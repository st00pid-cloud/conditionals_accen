package com.school.conditionals;

public class IfElseIfExample{
    public static void main(String[]args){
        int score = 82;
        System.out.println("Score: " + score);

        if (score >= 90){
            System.out.println("Rating: Excellent");
        } else if (score >= 80) {
            System.out.println("Rating: Very Good");
        } else if (score >= 70){
            System.out.println("Rating: Good");
        } else if (score >= 60){
            System.out.println("Rating: Satisfactory");
        } else {
            System.out.println("Rating: Needs Improvement");
        }
    }
}
