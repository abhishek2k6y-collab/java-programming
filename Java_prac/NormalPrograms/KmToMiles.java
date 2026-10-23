import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Kilometer:");
            double k = sc.nextDouble();
            double miles = k * 0.621371;
            System.out.println("Miles: " + miles);
            sc.close();
        }
    }
}