package Java_prac.ConnectPac;
import  Java_prac.ConnectPac.Mypack.FineCalculator;
import java.util.Scanner;

public class CallFine {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter No. of Days for book issued:");
            int Days = sc.nextInt();
            
            FineCalculator obj = new FineCalculator();
            obj.Fine(Days);
        }
    }
}