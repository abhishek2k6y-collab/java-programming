import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int rev=0;
            while(num!=0){
                int digit=num%10;
                rev=rev*10 + digit;
                num/=10;
            }
            System.out.println("Reverse:" + rev);
        }
    }
}
