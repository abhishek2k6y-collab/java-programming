abstract class Parent {
    abstract void displayParent();
}

class Child extends Parent {

    @Override
    public void displayParent() {
        System.out.println("This is parent class");
    }

    public void displayChild() {
        System.out.println("This is child class");
    }
}

public class AbstractParentt{
    public static void main(String[] args) {

        Child c = new Child();
        Parent p = new Child();

        p.displayParent();
        c.displayChild();
        c.displayParent();
    }
}
 
