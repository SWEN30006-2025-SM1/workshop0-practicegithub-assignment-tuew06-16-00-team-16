package example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;  // Correct addition
    }

    public int minus(int a, int b) {
        return a - b;  // Correct subtraction
    }

    public int multiply(int a, int b) {
        return a * b;  // Correct multiplication
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) a / b;  // Correct division
    }
}
