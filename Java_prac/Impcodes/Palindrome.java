import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int rev=0;
            int temp=num;
            while(num!=0){
                int digit=num%10;
                rev=rev*10 + digit;
                num/=10;
            }
            System.out.print(temp==rev ? " is palindrome" :" is not palindrome");
        }

    }
}
