/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        String s1 = x.nextLine();
        Double height = null;
        try {
            height = Double.valueOf(s1);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        System.out.print("Enter your weight in pounds: ");
        String s2 = x.nextLine();
        Double weight = null;
        try {
            weight = Double.valueOf(s2);

        } catch (NumberFormatException exception) {
            System.out.print("Input only integer or double values please.");
            System.exit(0);
        }

        double bmi = (weight/(height*height))*703;
        System.out.println("Your BMI is "+bmi);

        if(18.5<=bmi&&bmi<=25){
            System.out.println("You are within the ideal weight range");
        }else if(bmi>25) {
            System.out.println("You are overweight. You should see your doctor");
        }else {
            System.out.println("You are underweight. You should see your doctor");
        }

        System.exit(0);
    }
}