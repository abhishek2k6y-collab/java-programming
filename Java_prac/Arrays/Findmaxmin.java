//Program to find Maximum and minimum value in an array of size n, passed as argument.

import java.util.Scanner;

public class Findmaxmin {

    static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int M = sc.nextInt();
            
            int[] arr = new int[M];
            System.out.println("Enter " + M + " elements:");
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }
            findMaxMin(arr);
        }
    }
}

