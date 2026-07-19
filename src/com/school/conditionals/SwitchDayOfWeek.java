package com.school.conditionals;

public class SwitchDayOfWeek {
    public static void main(String[] args) {
        String day = "Saturday";
        System.out.println("Day: " + day);
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

        }


    }
}
