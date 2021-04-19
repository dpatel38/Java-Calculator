package com.tts;

public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtraction(int num1, int num2){
        return num1 - num2;
    }

    public int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public int division(int num1, int num2){
        if(num2 == 0){
            System.out.println("num2 cannot be zero.");
            return 0;
        }else{
            return num1 / num2;
        }
    }

    public int square(int num1){
        return num1 * num1;
    }
}
