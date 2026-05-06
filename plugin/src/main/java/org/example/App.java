package org.example;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.add(10, 5);
        int product = calculator.multiply(10, 5);
        int subtraction = calculator.subtract(10, 5);
        int division = calculator.divide(10, 5);

        String reversed = calculator.reverseString("Gradle");

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);
        System.out.println("Reversed String: " + reversed);
    }
}