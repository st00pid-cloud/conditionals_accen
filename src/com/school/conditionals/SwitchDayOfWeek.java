package com.school.conditionals;

public class SwitchDayOfWeek {
    public static void main(String[] args) {
        String day = "Saturday";
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (java.util.Arrays.asList(week).contains(day)){ //what
            System.out.println("Day: " + day);
        } else {
            System.out.println("Poop is not a day.");
        }

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                System.out.println("Type: Weekday");
                break;


            case "Saturday":
            case "Sunday":

                System.out.println("Type: Weekend");
                break;

            default:
                System.out.println("Invalid Input!");

        }


    }
}
