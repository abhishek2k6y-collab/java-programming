import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
                int total=0;
                System.out.println("Enter a marks of 5 Subjects:");
                for(int i=1;i<=5;i++){
                    System.out.print("Subject"+i+":");
                    int subject=sc.nextInt();
                    total+=subject;
                }
                double percentage= total/5.0;
                System.out.println("Total Marks:"+ total);
                System.out.println("percentage:"+ percentage + "%");
                int Grade= (int)percentage/10;
                switch(Grade){
                    case 10 -> System.out.println("Grade:A+");
                    case 9 -> System.out.println("Grade:A");
                    case 8 -> System.out.println("Grade:B");
                    case 7 -> System.out.println("Grade:C");
                    case 6 -> System.out.println("Grade:D");
                    case 5 -> System.out.println("Grade:E");
                    case 4 -> System.out.println("Grade:F");  
                }
        }
    }
}

      