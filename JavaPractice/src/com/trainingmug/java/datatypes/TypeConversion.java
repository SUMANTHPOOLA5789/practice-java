package com.trainingmug.java.datatypes;

public class TypeConversion {
    public static void main(String[] args) {
        /*
        Type Conversion
        1. Implicit Type Conversion
        2. Explicit Type Conversion
         */

        byte age;
        age = 23;
        int ageValue = age;//without Data loss in Implicit Type Conversion
        System.out.println("Age Value : "+ageValue);
        short marks;
        marks = 130;
        byte totalMarks = (byte)marks; // Data loss in Explicit Type Conversion
        System.out.println("Total Marks : "+totalMarks);

    }
}
