package com.trainingmug.java.fundamentals.controlstatements;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        /*
        Decision-Making Statements
        1. if Statements
        2. switch Statements

        Customer membership
        - Diamond - 20%
        - Gold - 15%
        - Silver - 10%
        - Others - 3%
         */
        String brand;
        brand = "apple";
        int productPrice;
        productPrice = 3498;
        int discount;
        byte discountPercentage;
        char membership;
        membership = 'D';
        if(membership == 'D'){
            discountPercentage = 20;
        }else if(membership == 'G'){
            discountPercentage = 15;
        }else if(membership == 'S'){
            discountPercentage = 10;
        }else{
            discountPercentage = 3;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("IF STATEMENTS");
        System.out.println("Discount : $" + discount);
        System.out.println("Final Price : $" + (productPrice - discount));


        switch (brand){
            case "samsung":
                if(membership == 'D'){
                    discountPercentage = 20;
                }else if(membership == 'G'){
                    discountPercentage = 15;
                }
                break;

            case "apple":
                if(membership == 'D'){
                    discountPercentage = 40;
                }else if(membership == 'G'){
                    discountPercentage = 20;
                }
                break;
            default: discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("SWITCH STATEMENTS");
        System.out.println("Discount : $" + discount);
        System.out.println("Final Price : $" + (productPrice - discount));
    }
}
