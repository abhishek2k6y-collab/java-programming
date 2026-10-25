import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerExcep {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();
                System.out.print("Enter denominator: ");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception: Cannot divide by zero");
            }
            catch(InputMismatchException z){
                System.out.println("Exception: Given inputs are not integers");
            }
        }    
}
