import java.util.Scanner;

class ArithmeticExcep {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            try {
                int result = a / b;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception: Cannot divide by zero");
            }
        }    
}
