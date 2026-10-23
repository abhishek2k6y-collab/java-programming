//3.Write a Java program using constructors, inheritance, and conditional statements to calculate parking fees. 
// Create a superclass , ParkingTicket , to store the vehicle number and parking duration. 
// Derive RegularTicket and LostTicket classes, using constructors with super to initialize the details. 
// Override a calculateFee() method in each subclass. For a regular ticket, charge ₹30 for up to two hours 
// and ₹20 for each additional hour, subject to a maximum charge of ₹150. 
// For a lost ticket, charge a flat ₹200 regardless of duration. 
// Accept the vehicle number, hours parked, and ticket status; 
// use a conditional statement to create the appropriate ticket object and display the fee.

import java.util.Scanner;

class ParkingTicket {
    String vehicleNo;
    int hours;

    ParkingTicket(String vehicleNo, int hours) {
        this.vehicleNo = vehicleNo;
        this.hours = hours;
    }

    double calculateFee() {
        return 0;
    }
}

class RegularTicket extends ParkingTicket {

    RegularTicket(String vehicleNo, int hours) {
        super(vehicleNo, hours);
    }

    @Override
    double calculateFee() {
        double fee;

        if (hours <= 2) {
            fee = 30;
        } else {
            fee = 30 + (hours - 2) * 20;
        }

        if (fee > 150) {
            fee = 150;
        }

        return fee;
    }
}

class LostTicket extends ParkingTicket {

    LostTicket(String vehicleNo, int hours) {
        super(vehicleNo, hours);
    }

    @Override
    double calculateFee() {
        return 200;
    }
}

public class Parking {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter vehicle number: ");
            String vehicleNo = sc.next();
            
            System.out.print("Enter hours parked: ");
            int hours = sc.nextInt();
        
            System.out.print("Is the ticket lost? (yes/no): ");
            String status = sc.next();
            
            ParkingTicket ticket;
            
            if (status.equalsIgnoreCase("yes")) {
                ticket = new LostTicket(vehicleNo, hours);
            } else {
                ticket = new RegularTicket(vehicleNo, hours);
            }
            
            System.out.println("\nVehicle Number: " + ticket.vehicleNo);
            System.out.println("Parking Duration: " + hours + " hours");
            System.out.println("Parking Fee: Rs. " + ticket.calculateFee());
    }
}
