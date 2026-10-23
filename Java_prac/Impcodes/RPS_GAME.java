import java.util.*;

public class RPS_GAME{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            
            System.out.println("-- ROCK -- PAPER -- SCISSORS -- GAME --");

            System.out.print("Enter Your Choice(Rock,Paper,Scissor):");
            String userinput = sc.next();
            
            String[] choices = {"Rock", "Paper", "Scissor"};
            String computerinput = choices[random.nextInt(3)];
            
            System.out.println("Your choice: " + userinput);
            System.out.println("Computer choice: " + computerinput);
            
            if (!userinput.equals("Rock") && !userinput.equals("Paper") && !userinput.equals("Scissor")){
                System.out.println("Invalid choice!");
            } else if (userinput.equals(computerinput)){
                System.out.println("It's a DRAW!");
            } else if ((userinput.equals("Rock") && computerinput.equals("Scissor")) ||
                       (userinput.equals("Paper") && computerinput.equals("Rock")) ||
                       (userinput.equals("Scissor") && computerinput.equals("Paper"))){
                System.out.println("You WIN!");
            } else {
                System.out.println("Computer WINS!");
            }
        }
    }
}
