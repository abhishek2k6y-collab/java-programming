//2.Create a VehicleService superclass that contains the vehicle number and parts cost. 
// Derive BikeService and CarService, with labor charges of ₹300 and ₹800, respectively. 
// Use constructors to initialize the details. Accept several vehicles, calculate each bill, and display the total revenue.


import java.util.Scanner;

class VehicleService{

    String Vehicle_Number;
    int Parts_Costs;
    int Labor_Charges;

    public VehicleService(String Vehicle_Number, int Parts_Costs){
        this.Vehicle_Number = Vehicle_Number;
        this.Parts_Costs = Parts_Costs;
    }   

    int calculate_TotalBill(){
        return Parts_Costs + Labor_Charges;
    }

}

class BikeService extends VehicleService{
    public BikeService(String Vehicle_Number,int Parts_Costs){
        super(Vehicle_Number,Parts_Costs);
        this.Labor_Charges=300;
    }
}

class CarService extends VehicleService{
    public CarService(String Vehicle_Number, int Parts_Costs) {
        super(Vehicle_Number, Parts_Costs);
        this.Labor_Charges = 800;
    }
}

public class Vehicles{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of vehicles: ");
            int n = sc.nextInt();
            
            int totalRevenue = 0;
            
            for (int i=1;i<=n;i++) {
                System.out.println("\nVehicle " + i);
                System.out.print("Enter vehicle type (1-Bike, 2-Car): ");
                int type = sc.nextInt();
                
                System.out.print("Enter vehicle number: ");
                String vehicle_Number = sc.next();
                System.out.print("Enter parts cost:");
                int parts_Cost = sc.nextInt();
                
                switch (type) {
                    case 1 -> {
                        BikeService bike = new BikeService(vehicle_Number, parts_Cost);
                        int bill = bike.calculate_TotalBill();
                        System.out.println("Vehicle Number: " + bike.Vehicle_Number);
                        System.out.println("Total Bill:" + bill);
                        totalRevenue += bill;
                    }
                    case 2 -> {
                        CarService car = new CarService(vehicle_Number, parts_Cost);
                        int bill = car.calculate_TotalBill();
                        System.out.println("Vehicle Number: " + car.Vehicle_Number);
                        System.out.println("Total Bill:" + bill);
                        totalRevenue += bill;
                    }
                    default -> System.out.println("Invalid vehicle type!");
                }
            }
            
            System.out.println("Total Revenue:" + totalRevenue);
        }
    }
}
