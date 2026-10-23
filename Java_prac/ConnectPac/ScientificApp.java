package Java_prac.ConnectPac;
import Java_prac.ConnectPac.Calculator.ScientificCalculator;
import java.util.Scanner;

public class ScientificApp {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             ScientificCalculator calc = new ScientificCalculator();
             int choice;
             
             do {
                 System.out.println("\n===== SCIENTIFIC CALCULATOR =====");
                 System.out.println("1. Addition");
                 System.out.println("2. Subtraction");
                 System.out.println("3. Multiplication");
                 System.out.println("4. Division");
                 System.out.println("5. Modulus");
                 System.out.println("6. Power");
                 System.out.println("7. Square Root");
                 System.out.println("8. Factorial");
                 System.out.println("9. Percentage");
                 System.out.println("10. Sin");
                 System.out.println("11. Cos");
                 System.out.println("12. Tan");
                 System.out.println("0. Exit");
                 
                 System.out.print("Enter your choice: ");
                 choice = sc.nextInt();
                 
                 switch (choice) {
                     
                     case 1 -> {
                         System.out.print("Enter two numbers: ");
                         double a1 = sc.nextDouble();
                         double b1 = sc.nextDouble();
                         System.out.println("Result = " + calc.add(a1, b1));
                     }
                     
                     case 2 -> {
                         System.out.print("Enter two numbers: ");
                         double a2 = sc.nextDouble();
                         double b2 = sc.nextDouble();
                         System.out.println("Result = " + calc.subtract(a2, b2));
                     }
                     
                     case 3 -> {
                         System.out.print("Enter two numbers: ");
                         double a3 = sc.nextDouble();
                         double b3 = sc.nextDouble();
                         System.out.println("Result = " + calc.multiply(a3, b3));
                     }
                     
                     case 4 -> {
                         System.out.print("Enter two numbers: ");
                         double a4 = sc.nextDouble();
                         double b4 = sc.nextDouble();
                         System.out.println("Result = " + calc.divide(a4, b4));
                     }
                     
                     case 5 -> {
                         System.out.print("Enter two numbers: ");
                         double a5 = sc.nextDouble();
                         double b5 = sc.nextDouble();
                         System.out.println("Result = " + calc.modulus(a5, b5));
                     }
                     
                     case 6 -> {
                         System.out.print("Enter base and power: ");
                         double base = sc.nextDouble();
                         double exponent = sc.nextDouble();
                         System.out.println("Result = " + calc.power(base, exponent));
                     }
                     
                     case 7 -> {
                         System.out.print("Enter number: ");
                         double number = sc.nextDouble();
                         System.out.println("Square Root = "
                                 + calc.squareRoot(number));
                     }
                     
                     case 8 -> {
                         System.out.print("Enter number: ");
                         int n = sc.nextInt();
                         System.out.println("Factorial = "
                                 + calc.factorial(n));
                     }
                     
                     case 9 -> {
                         System.out.print("Enter value and percentage: ");
                         double value = sc.nextDouble();
                         double percent = sc.nextDouble();
                         System.out.println("Percentage = "
                                 + calc.percentage(value, percent));
                     }
                     
                     case 10 -> {
                         System.out.print("Enter angle in degrees: ");
                         double angle1 = sc.nextDouble();
                         System.out.println("Sin = " + calc.sin(angle1));
                     }
                     
                     case 11 -> {
                         System.out.print("Enter angle in degrees: ");
                         double angle2 = sc.nextDouble();
                         System.out.println("Cos = " + calc.cos(angle2));
                     }
                     
                     case 12 -> {
                         System.out.print("Enter angle in degrees: ");
                         double angle3 = sc.nextDouble();
                         System.out.println("Tan = " + calc.tan(angle3));
                     }
                     
                     case 0 -> System.out.println("Calculator closed.");
                     
                     default -> System.out.println("Invalid choice!");
                 }
                 
             } while (choice != 0);
         }
}
}