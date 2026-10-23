/*import java.util.Scanner;

interface Photocopy {
    default double Compute_Photocopy(int pages) {
        if (pages <= 20)
            return pages * 2;
        else if (pages <= 50)
            return pages * 1.5;
        else
            return pages * 1;
    }
}

interface Printable {
    default double Compute_Print(int pages) {
        if (pages <= 50)
            return pages * 3;
        else if (pages <= 100)
            return pages * 2.5;
        else
            return pages * 2;
    }
}

interface Scannable {
    default double Compute_Scan(int pages) {
        if (pages <= 15)
            return pages * 2;
        else if (pages <= 30)
            return pages * 3;
        else
            return pages * 4;
    }
}

class Multi implements Photocopy, Printable, Scannable {

    String S_Name;
    int Total_Pages_Photo;
    int Total_Pages_Print;
    int Total_Pages_Scan;

    Multi(String name, int photo, int print, int scan) {
        S_Name = name;
        Total_Pages_Photo = photo;
        Total_Pages_Print = print;
        Total_Pages_Scan = scan;
    }

    void DisplayMethod() {
        double Photo = Compute_Photocopy(Total_Pages_Photo);
        double Print = Compute_Print(Total_Pages_Print);
        double Scan = Compute_Scan(Total_Pages_Scan);

        double Total_Amount = Photo + Print + Scan;

        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Student Name: " + S_Name);
        System.out.println("Photocopy Amount: Rs. " + Photo);
        System.out.println("Printing Amount: Rs. " + Print);
        System.out.println("Scanning Amount: Rs. " + Scan);
        System.out.println("Total Amount Payable: Rs. " + Total_Amount);
    }
}

public class Multii_Interface {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name of Student:");
            String name = sc.nextLine();
            
            System.out.println("Enter Photocopy Pages:");
            int photo = sc.nextInt();
            
            System.out.println("Enter Printing Pages:");
            int print = sc.nextInt();
            
            System.out.println("Enter Scanning Pages:");
            int scan = sc.nextInt();
            
            Multi obj = new Multi(name, photo, print, scan);
            obj.DisplayMethod();
    }
} 
*/


import java.util.Scanner;

interface Photocopy {
    double Compute_Photocopy(int pages);
}

interface Printable {
    double Compute_Print(int pages);
}

interface Scannable {
    double Compute_Scan(int pages);
}

class Compute implements Photocopy, Printable, Scannable {
    @Override
    public double Compute_Photocopy(int pages) {
        if (pages <= 20)
            return pages * 2;
        else if (pages <= 50)
            return pages * 1.5;
        else
            return pages * 1;
    }

    @Override
    public double Compute_Print(int pages) {
        if (pages <= 50)
            return pages * 3;
        else if (pages <= 100)
            return pages * 2.5;
        else
            return pages * 2;
    }

    @Override
    public double Compute_Scan(int pages) {
        if (pages <= 15)
            return pages * 2;
        else if (pages <= 30)
            return pages * 3;
        else
            return pages * 4;
    }
}

class Multi extends Compute {

    String S_Name;
    int Total_Pages_Photo;
    int Total_Pages_Print;
    int Total_Pages_Scan;

    Multi(String S_Name, int Total_Pages_Photo, int Total_Pages_Print, int Total_Pages_Scan) {
        this.S_Name = S_Name;
        this.Total_Pages_Photo = Total_Pages_Photo;
        this.Total_Pages_Print = Total_Pages_Print;
        this.Total_Pages_Scan = Total_Pages_Scan;
    }

    void DisplayMethod() {
        double Photo = Compute_Photocopy(Total_Pages_Photo);
        double Print = Compute_Print(Total_Pages_Print);
        double Scan = Compute_Scan(Total_Pages_Scan);

        double Total_Amount = Photo + Print + Scan;

        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Student Name: " + S_Name);
        System.out.println("Photocopy Amount: Rs. " + Photo);
        System.out.println("Printing Amount: Rs. " + Print);
        System.out.println("Scanning Amount: Rs. " + Scan);
        System.out.println("Total Amount Payable: Rs. " + Total_Amount);
    }
}

public class PhotocopyDetails{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name of Student:");
            String S_Name = sc.next();
            
            System.out.print("Enter Photocopy Pages:");
            int Total_Pages_Photo = sc.nextInt();
            
            System.out.print("Enter Printing Pages:");
            int Total_Pages_Print = sc.nextInt();
            
            System.out.print("Enter Scanning Pages:");
            int Total_Pages_Scan = sc.nextInt();
            
            Multi obj = new Multi(S_Name, Total_Pages_Photo,Total_Pages_Print, Total_Pages_Scan);
            obj.DisplayMethod();
    }
}
