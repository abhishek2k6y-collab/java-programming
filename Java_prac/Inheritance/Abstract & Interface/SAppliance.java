//Create an interface SmartAppliance containing methods switchOn(), switchOff(), and double calculateEnergy(double hours).
//Implement it in Fan and Light. A fan consumes 75 watts, while a light consumes 12 watts. 
//Calculate energy consumption using: Energy in kWh = Power in watts × Operating hours ÷ 1,000
//Accept operating hours, demonstrate switching each appliance on and off, and display its energy consumption. 
//Reject negative operating hours.

import java.util.Scanner;

interface SmartAppliance{
    void SwitchOn();
    void SwitchOff();
    double CalculateEnergy(double hours);
}

class Fan implements SmartAppliance{
    @Override
    public void SwitchOn(){
        System.out.println("Fan is Switched On");
    }

    @Override
    public void SwitchOff(){
        System.out.println("Fan is Switched off");
    }

    @Override
    public double CalculateEnergy(double hours){
        return 75*hours/1000;
    }
}

class Light implements SmartAppliance{
    @Override
    public void SwitchOn(){
        System.out.println("Light is Switched On");
    }

    @Override
    public void SwitchOff(){
        System.out.println("Light is Switched off");
    }

    @Override
    public double CalculateEnergy(double hours){
        return 12*hours/1000;
    }
}

public class SAppliance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operating hours: ");
        double hours = sc.nextDouble();

        if (hours < 0){
            System.out.println("Error: Operating hours cannot be negative.");
            return;
        }

        SmartAppliance F = new Fan();
        SmartAppliance L = new Light();

        System.out.println("\n--- Fan ---");
        F.SwitchOn();
        System.out.printf("Energy Consumption: %.3f kWh%n",F.CalculateEnergy(hours));
        F.SwitchOff();

        System.out.println("\n--- Light ---");
        L.SwitchOn();
        System.out.printf("Energy Consumption: %.3f kWh%n",L.CalculateEnergy(hours));
        L.SwitchOff();
    }
}
