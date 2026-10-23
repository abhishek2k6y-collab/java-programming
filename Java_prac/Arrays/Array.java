/*import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the no. of elements in an array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter elements of an array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}
*/

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] arr=new int[3][3];
            System.out.println("Enter Elements:");
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                   System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
}