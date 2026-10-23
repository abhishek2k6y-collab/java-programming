import java.util.Scanner;

public class D_EmployeeDetails {

    int id;
    String name;
    int age;
    double basic;
    double hra;
    double da;
    double total_salary;

    // Default Constructor
    D_EmployeeDetails() {
        id = 25261799;
        name = "Abhishek";
        age = 20;
        basic = 0;
        hra = 0;
        da = 0;
        total_salary = 0;
    }

    // Display Employee Details
    void DisplayDetail(){
        System.out.println("\nEmployee Details");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Basic Salary: " + basic);
        System.out.println("Employee HRA: " + hra);
        System.out.println("Employee DA: " + da);
        System.out.println("Employee Total Salary: " + total_salary);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();
            System.out.print("Enter HRA: ");
            double hra = sc.nextDouble();
            System.out.print("Enter DA: ");
            double da = sc.nextDouble();

            // Create object using Default Constructor
            D_EmployeeDetails obj = new D_EmployeeDetails();

            // Assign salary values
            obj.basic = basic;
            obj.hra = hra;
            obj.da = da;

            // Calculate Total Salary
            obj.total_salary = obj.basic + obj.hra + obj.da;

            // Display
            obj.DisplayDetail();
        }
    }
}