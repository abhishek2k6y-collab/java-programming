package Java_prac.ConnectPac.Calculator;

public class ScientificCalculator{
    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    // Modulus
    public double modulus(double a, double b) {
        return a % b;
    }

    // Power
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    // Square root
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    // Factorial
    public long factorial(int n) {
        if (n < 0) {
            return -1;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Percentage
    public double percentage(double value, double percent) {
        return (value * percent) / 100;
    }

    // Sin
    public double sin(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    // Cos
    public double cos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    // Tan
    public double tan(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}
