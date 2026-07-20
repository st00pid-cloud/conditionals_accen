package com.school.conditionals;

public class NumberClassifier {
    public static void main(String[] args) {
        int num = -15;

        System.out.println("Number: " + num);
        if(num > 0){
            System.out.println("Sign: Positive");
        } else if(num<0){
            System.out.println("Sign: Negative");
        } else if(num == 0) {
            System.out.println("Number is equal to zero");
        }

        if(num%2 == 0){
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        if(num%5 == 0){
            System.out.println("Multiple of 5: Yes");
        } else {
            System.out.println("Multple of 5: No");
        }
    }
}
