import java.util.Scanner;

public class GradeEncrypt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter grade (A, B, C, D, F): ");
            char grade = sc.next().charAt(0);
            
            // Encryption
            char encrypted = (char)(grade + 8);
            System.out.println("Encrypted grade: " + encrypted);
            
            // Decryption
            char decrypted = (char)(encrypted - 8);
            System.out.println("Correct grade: " + decrypted);
        }
    }
}
