import java.util.Scanner;

public class ArrayExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter Array Elements:");
        
        for(int i = 0; i < 5; i++){
            System.out.print("Element"+i+":");
            arr[i]=sc.nextInt();
        }

        try{
            System.out.println("Enter Index:");
            int ind=sc.nextInt();
            System.out.println("Value at index "+ ind +":"+arr[ind]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: Given index is not present");
        }

}
}