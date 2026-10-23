import java.util.*;

public class StringOp{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String s1 = sc.next();
            
            System.out.print("Enter second string: ");
            String s2 = sc.next();
            
            System.out.println("Length: " + s1.length());
            System.out.println("Uppercase: " + s1.toUpperCase());
            System.out.println("Lowercase: " + s1.toLowerCase());
            System.out.println("Concatenation: " + s1.concat(s2));
            System.out.println("Equals: " + s1.equals(s2));
            System.out.println("Ignore Case: " + s1.equalsIgnoreCase(s2));
            System.out.println("Character at index: " + s1.charAt(5));
            System.out.println("Substring: " + s1.substring(0, 4));
            System.out.println("Replace a with @: " + s1.replace('a', '@'));
            System.out.println("Contains: " + s1.contains(s2));
            System.out.println("Starts with: " + s1.startsWith("A"));
            System.out.println("Ends with: " + s1.endsWith("a"));
            System.out.println("Index of a: " + s1.indexOf('a'));
            System.out.println("Trim: " + s1.trim());
            System.out.println("Compare: " + s1.compareTo(s2));
        }
    }
}
