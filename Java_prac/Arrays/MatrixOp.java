//Experiment 7: WAP to take an input of elements of 2 matrices (Array1[3][3], Array2[3][3]) and 
// compute matrix multiplication, addition, subtraction and transpose. Use Switch case to form 4 Cases.

import java.util.Scanner;

class Matrix_Operations {

    void addition(int[][] a, int[][] b) {
        System.out.println("Addition:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    void subtraction(int[][] a, int[][] b) {
        System.out.println("Subtraction:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j] - b[i][j]) + " ");
            }
            System.out.println();
        }
    }

    void multiplication(int[][] a, int[][] b) {
        System.out.println("Multiplication:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;

                for (int k = 0; k < 3; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }

                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    void transpose(int[][] a) {
        System.out.println("Transpose of Matrix 1:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOp {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[][] arr1 = new int[3][3];
            int[][] arr2 = new int[3][3];
            
            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Transpose");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            Matrix_Operations obj = new Matrix_Operations();
            
            switch (choice) {
                case 1 -> obj.addition(arr1, arr2);
                case 2 -> obj.subtraction(arr1, arr2);
                case 3 -> obj.multiplication(arr1, arr2);
                case 4 -> obj.transpose(arr1);
                case 5 -> obj.transpose(arr2);
                default -> System.out.println("Invalid choice");
            }
        }
    }
}