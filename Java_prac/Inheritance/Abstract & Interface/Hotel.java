//Experiment 19.1: Create an interface HotelService containing double calculateBookingAmount(). 
// Declare a nested interface CancellationPolicy containing double calculateRefund(int daysBeforeArrival).
// Implement both interfaces in a class RoomBooking. A standard room costs ₹2,000 per night, 
// while a deluxe room costs ₹3,500 per night. Apply the following refund rules:
// Cancellation time	                                  Refund
// At least 7 days before arrival	    100% of booking amount
// 3–6 days before arrival	             50% of booking amount
// 0–2 days before arrival	              No refund
//•Accept the room type, number of nights, and cancellation timing. 
// Display the booking amount, refund, and amount retained by the hotel.

import java.util.*;

interface HotelService{
    double calculateBookingAmount();

    interface CancellationPolicy{
        double calculateRefund(int daysBeforeArrival);
    }
}

class RoomBooking implements HotelService,HotelService.CancellationPolicy{
    @SuppressWarnings("unused")
    String roomType;
    int nights;
    double price;

    RoomBooking(String roomType, int nights){
        this.roomType = roomType;
        this.nights = nights;

        if(roomType.equalsIgnoreCase("standard")){
            price = 2000;
        } else if (roomType.equalsIgnoreCase("deluxe")){
            price = 3500;
        } else {
            price = 0;
        }
    }

    @Override
    public double calculateBookingAmount(){
        return price * nights;
    }

    @Override
    public double calculateRefund(int daysBeforeArrival){
        double amount = calculateBookingAmount();
        if (daysBeforeArrival >= 7){
            return amount;
        } else if (daysBeforeArrival >= 3){
            return amount * 0.50;
        } else {
            return 0;
        }
    }
}


public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter room type (standard/deluxe): ");
        String roomType = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        System.out.print("Enter days before arrival for cancellation: ");
        int days = sc.nextInt();

        if (nights <= 0 || days < 0 || (!roomType.equalsIgnoreCase("standard") && !roomType.equalsIgnoreCase("deluxe"))){
            System.out.println("Invalid input!");
        } else {
            RoomBooking bk = new RoomBooking(roomType, nights);

            double amount = bk.calculateBookingAmount();
            double refund = bk.calculateRefund(days);
            double retained = amount - refund;

            System.out.println("\n--- Booking Details ---");
            System.out.println("Room Type: " + roomType);
            System.out.println("Number of Nights: " + nights);
            System.out.println("Booking Amount: Rs. " + amount);
            System.out.println("Refund Amount: Rs. " + refund);
            System.out.println("Amount Retained by Hotel: Rs. " + retained);
        }
    }
}
