package com.tts;

import java.util.Scanner;

public class MagicCalculator extends Calculator{
    public static int factorial(int n){
        if (n == 1 || n == 0){
            return 1;
        }else {
            return  n * factorial (n - 1);
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        int square = calculator.square(number);
        System.out.println("The Square Root of "+ number + " is " + square);

        System.out.print("Enter angle in degree: ");
        double degree = input.nextDouble();

        double radians = Math.toRadians(degree);

        System.out.println("Sin is " + Math.sin(radians));
        System.out.println("Cosine is " + Math.cos(radians));
        System.out.println("Tangent is " + Math.tan(radians));
        System.out.println("Factorial of  " + number + " is: " + factorial(number));
     }
}
