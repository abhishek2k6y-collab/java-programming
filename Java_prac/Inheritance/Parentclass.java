// Experiment 16: Create a class with a method that prints "This is parent class" and 
// it's subclass with another method that prints "This is child class".
// Now, create an object for each of the class and call ;
//•method of parent class by object of parent class. 
//•method of child class by object of child class. 
//•method of parent class by object of child class.

class Parent {
    void displayParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class");
    }
}

public class Parentclass{
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        // Method of parent class by parent object
        p.displayParent();

        // Method of child class by child object
        c.displayChild();

        // Method of parent class by child object
        c.displayParent();
    }
}
 
    

