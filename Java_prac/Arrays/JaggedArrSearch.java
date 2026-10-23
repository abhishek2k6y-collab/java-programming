import java.util.Scanner;

public class JaggedArrSearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Create jagged array with different row sizes
            int[][] arr = new int[3][];
            arr[0] = new int[2];
            arr[1] = new int[3];
            arr[2] = new int[4];
            
            System.out.println("Enter elements:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Enter element at row " + i + ", column " + j + ": ");
                    arr[i][j] = sc.nextInt();
                }
            }
            
            System.out.print("\nEnter number to search: ");
            int search = sc.nextInt();
            
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == search) {
                        System.out.println("Element found at row "+ i + ", column " + j);
                        found = true;
                    }
                }
            }
            
            if (!found) {
                System.out.println("Element not found.");
            }
        }
    }
}
