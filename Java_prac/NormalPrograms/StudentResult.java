import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks of Subject 1: ");
            int m1 = sc.nextInt();
            System.out.print("Enter marks of Subject 2: ");
            int m2 = sc.nextInt();
            System.out.print("Enter marks of Subject 3: ");
            int m3 = sc.nextInt();

            int total = m1 + m2 + m3;
            double percentage = total / 3.0;

            if (percentage >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
                System.out.println("Student is PASS");
            } else {
                System.out.println("Student is FAIL");
            }
            System.out.println("Total Marks = " + total);
            System.out.println("Percentage = " + percentage + "%");
        }
    }
}