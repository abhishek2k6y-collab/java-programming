//Program to read a string and replace all the vowels with a '$' symbol

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Replace{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String ch = br.readLine();
        String abc = "";

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                abc = abc + "$";
            } 
            else {
                abc = abc + c;
            }
        }

        System.out.println("Replaced String: " + abc);
    }
}
