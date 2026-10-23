//1. Create a superclass Transport with a distance field and a calculateFare() method. 
// Derive Bus and Cab, charging ₹8 and ₹18 per kilometre, respectively. 
// Add a ₹50 booking charge to a cab booking. Display fares for the same journey using both subclasses.


import java.util.Scanner;

class Transport{
    int Distance;
    void CalculateFare(int Distance){
        this.Distance=Distance;
    }
    
}

class Car extends Transport{
    void DisplayFare(){
         int TotalFare_Car = 50 + 18 * Distance;
         System.out.println("Total Car Fare:" + TotalFare_Car);
    }
}

class Bus extends Transport{
    void DisplayFare(){
         int TotalFare_Bus = 8 * Distance;
         System.out.println("Total Bus Fare:" + TotalFare_Bus);
    }
}

public class TransportDis_Fare{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter The Distance(km) Travelled:");
            int Distance=sc.nextInt();
            System.out.println("Total Distance Travelled:"+ Distance);
            
            Car obj = new Car();
            obj.CalculateFare(Distance);
            obj.DisplayFare();
            
            Bus abc = new Bus();
            abc.CalculateFare(Distance);
            abc.DisplayFare();
    } 
}
