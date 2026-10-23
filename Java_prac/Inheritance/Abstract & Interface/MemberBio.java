//Experiment 15: Create a class named 'Member' having the following members: Name, Age, Phone number, Address, Salary. 
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
// The 'Employee' and 'Manager' classes have data members 'specialisation' and 'department' respectively.
// Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

abstract class Member {
    String Name;
    int Age;
    long phoneNumber;
    String Address;
    double Salary;

    public Member(String Name, int Age, long phoneNumber, String Address, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.phoneNumber = phoneNumber;
        this.Address = Address;
        this.Salary = Salary;
    }

    @SuppressWarnings("unused")
    abstract void printSalary();
}

class Employee extends Member {
    String Specialisation;
    String Department;

    public Employee(String Name, int Age, long phoneNumber, String Address, double Salary, String Specialisation, String Department){
        super(Name, Age, phoneNumber, Address, Salary);
        this.Specialisation = Specialisation;
        this.Department = Department;
    }

    @Override
    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

class Manager extends Member {
    String Specialisation;
    String Department;

    public Manager(String Name, int Age, long phoneNumber, String Address, double Salary, String Specialisation ,String Department){
        super(Name, Age, phoneNumber, Address, Salary);
        this.Specialisation=Specialisation;
        this.Department = Department;
    }

    @Override
    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

public class MemberBio {
    public static void main(String[] args) {

        Employee Ep = new Employee("Abhi", 19, 1234567899L, "SouthPark",50000, "Artificial Intelligence","SOES");
        Manager Mn = new Manager("Abhishek", 35, 1245678949L, "NorthPark", 150000, "Artifical Intelligence & Machine Learning","SOES");

        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + Ep.Name);
        System.out.println("Age: " + Ep.Age);
        System.out.println("Phone: " + Ep.phoneNumber);
        System.out.println("Address: " + Ep.Address);
        Ep.printSalary();
        System.out.println("Specialisation: " + Ep.Specialisation);
        System.out.println("Specialisation: " + Ep.Department);

        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + Mn.Name);
        System.out.println("Age: " + Mn.Age);
        System.out.println("Phone: " + Mn.phoneNumber);
        System.out.println("Address: " + Mn.Address);
        Mn.printSalary();
        System.out.println("Specialisation: " + Mn.Specialisation);
        System.out.println("Department: " + Mn.Department);
    }
}
