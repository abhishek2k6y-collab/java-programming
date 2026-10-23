package Bill;
import java.util.*;

class TotalEBill{
    void DisplayDetails(UnitCost obj){
        System.out.println("ELectricity Bill Details:");
        System.out.println("Customer Name:"+ obj.Customer_Name); 
        System.out.println("Customer ID:"+ obj.Customer_ID); 
        System.out.println("Total no. of units consumed:"+ obj.Units);
        System.out.println("Total Electricity Bill:"+ obj.Total_Bill);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the NO. of Electricity units");
            int units=sc.nextInt();

            UnitCost obj= new UnitCost("Abhishek Yadav",25261799,units);
            TotalEBill bill = new TotalEBill();
            bill.DisplayDetails(obj);
        }
    }
}
