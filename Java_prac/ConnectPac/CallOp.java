package Java_prac.ConnectPac;
import Java_prac.ConnectPac.Mypack.Operations;
import java.util.Scanner;

public class CallOp {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Enter first number: ");
             int a = sc.nextInt();
             System.out.print("Enter second number: ");
             int b = sc.nextInt();
             Operations obj = new Operations();
             
             obj.add(a, b);
             obj.subtract(a, b);
             obj.multiply(a, b);
             obj.divide(a, b);
             obj.modulus(a, b);
         }
    }
}
