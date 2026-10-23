
/*public class Arithmeticop{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Performing Arithmetic Operations:");
            System.out.println("Enter the numbers a & b:");
            Float a=sc.nextFloat();
            Float b=sc.nextFloat();
            Float sum=a+b;
            Float diff=a-b;
            Float div=a/b;
            Float mul=a*b;
            Float rem=a%b;
            System.out.println("Addition:"+sum);
            System.out.println("Difference:"+diff);
            System.out.println("Division:"+div);
            System.out.println("MUltiplication:"+mul);
            System.out.println("Remainder"+rem);
            sc.close();
        }

    }
}*/

import java.util.Scanner;

public class Arithmeticop{

    static int Addition(int a,int b){
        return a+b;
    }

    static int Substraction(int a, int b){
        return a-b;
    }

    static int MUltiplication(int a, int b){
        return a*b;
    }

    static int Remainder(int a,int b){
        return a%b;
    }

    static int Division(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Performing arithmetic opertaions:");
            System.out.println("Enter the numberss:");
            int num1=sc.nextInt();
            int num2=sc.nextInt();

            int v=Addition(num1, num2);
            System.out.println("Sum is: "+v);

            int w=Substraction(num1, num2);
            System.out.println("Difference is: "+w);

            int x=MUltiplication(num1, num2);
            System.out.println("Product is: "+x);

            int y=Remainder(num1, num2);
            System.out.println("Remainder is: "+y);

            int z=Division(num1, num2);
            System.out.println("Division is: "+z);
            
            sc.close();
        }
    }
}