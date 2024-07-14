package com.example.myjavaapp;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println("Result: " + result);
    }
}
