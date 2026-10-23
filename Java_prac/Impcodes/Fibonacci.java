import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of terms: ");
            int num = sc.nextInt();
            int num1 = 0;
            int num2 = 1;
            int sum = 0;
            for (int i = 0; i < num; i++) {
                System.out.print(num1 + " ");
                sum += num1;
                int next = num1 + num2;
                num1 = num2;
                num2 = next;
            }
            System.out.println("\nSum of Fibonacci series: " + sum);
        }
    }
}