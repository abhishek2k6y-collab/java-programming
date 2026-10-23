import java.util.Scanner;

public class PNEO {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer number:");
            int num=sc.nextInt();
            if(num>0){
                System.out.println(num +"is a positive number");
                if(num%2==0){
                    System.out.println(num +" is an even number");
                }else{
                    System.out.println(num + " is an odd number");
                }
            }else{
                System.out.println(num + "is a negative number");
            }
        }
    }
    
}
