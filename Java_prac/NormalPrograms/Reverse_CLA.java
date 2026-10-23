//Experiment 8.1: WAP  to take several numbers as inputs and print them in reverse and ascending order using CLA.

public class Reverse_CLA {
    public static void main(String[] args) {
        System.out.print("The Reverse order:");
        for(int i=args.length-1;i>=0;i--){
            System.out.print(args[i]+" ");
        }

        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[2]);
        System.out.println("the Sum of two index is:"+ (a+b));
    } 
}
