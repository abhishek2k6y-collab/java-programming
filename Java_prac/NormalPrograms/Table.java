import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number for Table:");
            int num = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d * %d = %d\n", num, i, num * i);
            }
            sc.close();
        }
    }
}