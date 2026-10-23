//Exp 13.1: A library applies different fine rules to books and DVDs. 
// Create an abstract class LibraryItem containing item ID, title, and overdue days, with an abstract method calculateFine().
// Derive Book and DVD. Books have a three-day grace period; charge ₹2 for each overdue day beyond that period, 
// with a maximum fine of ₹100. DVDs have no grace period; charge ₹10 per overdue day, with a maximum fine of ₹300.
// Accept details of multiple items, store them in a LibraryItem array, and display individual fines and the total fine.

import java.util.*;

abstract class LibraryItem{
    int Item_ID;
    String Title;
    int Overdue_Days;

    public LibraryItem(int Item_ID, String Title, int Overdue_Days){
        this.Item_ID = Item_ID;
        this.Title = Title;
        this.Overdue_Days = Overdue_Days;
    }

    @SuppressWarnings("unused")
    abstract int calculateFine();
}

class Book extends LibraryItem{

    public Book(int Item_ID, String Title, int Overdue_Days) {
        super(Item_ID, Title, Overdue_Days);
    }

    int Fine;
    @Override
    public int calculateFine(){
        if(Overdue_Days > 3){
            Fine = 2*(Overdue_Days-3);
            return Fine;
        }
        
        if(Fine > 100){
            Fine = 100;
            return Fine;
        }
        return Fine;
}
}

class DVD extends LibraryItem{

    public DVD(int Item_ID, String Title, int Overdue_Days) {
        super(Item_ID, Title, Overdue_Days);
    }

    int Fine;
    @Override
    public int calculateFine(){
        if(Overdue_Days > 1){
            Fine = 10*Overdue_Days;
            return Fine;
        }
        
        if(Fine > 300){
            Fine = 300;
            return Fine;
        }
        return Fine;
}
}

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Items to be issued:");
        int n = sc.nextInt();

        LibraryItem[] items = new LibraryItem[n];
        int totalFine = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem "+ (i + 1));

            System.out.print("Enter Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter type (Book/DVD):");
            String type = sc.nextLine();
            
            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter overdue days: ");
            int days = sc.nextInt();
            sc.nextLine();

            if (days < 0) {
                System.out.println("Overdue days cannot be negative.");
                i--;
                continue;
            }

            if (type.equalsIgnoreCase("Book")) {
                items[i] = new Book(id, title, days);
            } else if (type.equalsIgnoreCase("DVD")) {
                items[i] = new DVD(id, title, days);
            } else {
                System.out.println("Invalid item type. Enter Book or DVD.");
            }
        }

        System.out.println("\n----- Library Fine Details -----");

        for (LibraryItem item : items) {
            int fine = item.calculateFine();
            System.out.println("Item ID: " + item.Item_ID);
            System.out.println("Title: " + item.Title);
            System.out.println("Overdue Days: " + item.Overdue_Days);
            System.out.println("Fine: Rs. " + fine);
            System.out.println("----------------------");

            totalFine += fine;
        }

        System.out.println("Total Fine: Rs. " + totalFine);
    }
}
