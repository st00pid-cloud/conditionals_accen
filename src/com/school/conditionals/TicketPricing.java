package com.school.conditionals;

public class TicketPricing {
    static final double BASE_PRICE = 500.00;
    public static void main(String[] args) {
        int age = 25;
        String memberType = "Gold";

        double age_discount = 0.0;
        if (age < 12) {
            age_discount = BASE_PRICE * 0.50;  // 50% off
        } else if (age <= 17) {
            age_discount = BASE_PRICE * 0.25;  // 25% off
        } else if (age <= 59) {
            age_discount = 0.0;                 // No discount
        } else {
            age_discount = BASE_PRICE * 0.30;  // 30% off (Seniors)
        }

        double member_discount_amount = 0.0;
        switch(memberType) {
            case "Gold" :
                member_discount_amount = 100.0;
                break;
            case "Silver" :
                member_discount_amount = 50.0;
                break;
            case "Bronze" :
                member_discount_amount = 25.0;
                break;
            case "default" :
            default:
                member_discount_amount = 0.0;
                break;
        }

        double priceAfterAgeDiscount = BASE_PRICE - age_discount;
        double finalPrice = priceAfterAgeDiscount - member_discount_amount;

        System.out.println("Age: " + age);
        System.out.println("Member type: " + memberType);
        System.out.println("Base Price: " + BASE_PRICE);
        System.out.println("Age Discount: " + age_discount);
        System.out.println("Price After Age Discount: " + priceAfterAgeDiscount);
        System.out.println("Member Discount: " + member_discount_amount);
        System.out.println("Final Price: " + finalPrice);
    }
}