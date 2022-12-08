package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello gt!");
        SimpleCalculator calculator = new  SimpleCalculator();
        int result = calculator.Add(2,6);
        System.out.println(result);
    }
}