import java.util.Scanner;

public class WeekDay{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter a number(1-7):");
                int a =sc.nextInt();
                switch (a) {
                        case 1 -> System.out.println("Monday");
                        case 2 -> System.out.println("Tuesday");
                        case 3 -> System.out.println("Wednesday");
                        case 4 -> System.out.println("Thursday");
                        case 5 -> System.out.println("Friday");
                        case 6 -> System.out.println("Saturday");
                        case 7 -> System.out.println("Sunday");
                        default -> System.out.println("Not a valid number");
                }
     sc.close();
        }
    }
} 