package com.trainingmug.java.fundamentals.controlstatements;

public class JumpStatements {
    public static void main(String[] args) {
        System.out.println("Break Statement");
        for(int i = 1 ; i <= 3 ; i++ ){
            for(int j = 1 ; j <= 3 ; j++ ){
                if(i == j)
                    break;
                System.out.println(i+"  "+j);
            }
        }
        System.out.println("Continue Statement");
        for(int i = 1 ; i <= 3 ; i++ ){
            for(int j = 1 ; j <= 3 ; j++ ){
                if(i == j)
                    continue;
                System.out.println(i+"  "+j);
            }
        }
        System.out.println("Label Break Statement");
        outer:for(int i = 1 ; i <= 3 ; i++ ){
            inner:for(int j = 1 ; j <= 3 ; j++ ){
                if(i == j)
                    break outer;
                System.out.println(i+"  "+j);
            }
        }
    }
}
