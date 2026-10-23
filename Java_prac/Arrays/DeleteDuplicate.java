//10 ( i) Program to delete duplicate elements from an array of size 5.

import java.util.Scanner;

public class DeleteDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            int n=5;

            System.out.println("Enter 5 elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        for (int k = j; k < n-1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        n--;
                        j--;
                    }
                }
            }
            
            System.out.println("Array after deleting duplicates:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}