package Java_prac.ConnectPac;

import Java_prac.ConnectPac.Quadratic_EQ.Quadratic;
import Java_prac.ConnectPac.Quadratic_EQ.Quad2;
import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Quadratic q = new Quad2();
        q.findRoots(a, b, c);
    }
}
