import java.util.Scanner;

public class P_EmployeeDetails{
    int id;
    String name;
    int age;
    double basic;
    double hra;
    double da;
    double total_salary;
    
    P_EmployeeDetails(int id, String name, int age,double basic, double hra, double da){
        this.id = id;
        this.name = name;
        this.age = age;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        
        total_salary=basic+hra+da;
    }


    void DisplayDetail(){
        System.out.println("Employee details");
        System.out.println("Employee Name:" + name);
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee Basics:"+basic);
        System.out.println("Employee HRA:"+hra);
        System.out.println("Employee DA:"+da);
        System.out.println("Employee Total Salary:"+ total_salary);
    }
  
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Basic Salary:");
            double basic = sc.nextDouble();
            System.out.print("Enter HRA:"); 
            double hra = sc.nextDouble();
            System.out.print("Enter DA:");
            double da = sc.nextDouble();
            
            P_EmployeeDetails obj=new P_EmployeeDetails(25261799,"Abhishek",20,basic,hra,da);
            obj.DisplayDetail();
        }
    }
}