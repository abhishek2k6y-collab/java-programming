class Student {
    // Data members
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Demonstrate {
    public static void main(String[] args) {
        // Creating an object
        Student s1 = new Student();

        // Assigning values
        s1.name = "John";
        s1.age = 20;

        // Calling the method
        s1.display();
    }
}
