import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number:");
            int num=sc.nextInt();
            boolean Prime =true;
            if(num<=1){
                Prime=false;
            }
            for(int i=2;i<num;i++){
                if(num%i==0){
                    Prime=false;
                    break;
                }
            }
            System.out.println(Prime? "Prime Number" : "Not a Prime Number");
        }
}
}
