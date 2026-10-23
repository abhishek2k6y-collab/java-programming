
public class Methodoverload {

    // Method for addition
    void operation(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Overloaded method for subtraction
    void operation(double a, double b) {
        System.out.println("Subtraction = " + (a - b));
    }

    public static void main(String[] args) {
        Methodoverload obj = new Methodoverload();

        obj.operation(10, 5);        // Calls int method
        obj.operation(10.0, 5.0);    // Calls double method
    }
}