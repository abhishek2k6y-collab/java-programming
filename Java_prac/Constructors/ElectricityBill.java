import java.util.Scanner;

public class ElectricityBill {
       String Customer_Name;
       int Customer_ID;
       int Units;
       Double Total_Bill;

    ElectricityBill(String Customer_Name, int Customer_ID, int Units) {
       this.Customer_Name=Customer_Name;
       this.Customer_ID=Customer_ID;
       this.Units=Units; 
       Double cost;
       if(Units<=100){
              cost=Units*3d;
              Total_Bill= cost + cost*(18.0/100);
       }
       else if(Units>100 && Units<=300){
              cost=100*3 + (Units-100)*5d;
              Total_Bill= cost + cost*(18.0/100);
       }else{
              cost=100*3 + 200*5 + (Units-300)*8d;
              Total_Bill= cost + cost*(18.0/100);
       }

    }
     
    void DisplayDetails(){
        System.out.println("ELectricity Bill Details:");
        System.out.println("Customer Name:"+Customer_Name); 
        System.out.println("Customer ID:"+Customer_ID); 
        System.out.println("Total no. of units consumed:"+Units);
        System.out.println("Total Electricity Bill:"+Total_Bill);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the NO. of Electricity units");
            int units=sc.nextInt();

            ElectricityBill obj= new ElectricityBill("Abhishek Yadav",25261799,units);
            obj.DisplayDetails();
        }
    }
}
