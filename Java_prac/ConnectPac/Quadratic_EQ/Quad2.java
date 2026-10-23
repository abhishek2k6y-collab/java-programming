package Java_prac.ConnectPac.Quadratic_EQ;

public class Quad2 implements Quadratic {
    @Override
    public void findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
        } 
        else if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } 
        else if (d == 0) {
            double r = -b / (2 * a);

            System.out.println("Two equal real roots:");
            System.out.println("Root = " + r);
        } 
        else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);

            System.out.println("Complex roots:");
            System.out.println("Root 1 = " + real + " + " + imag + "i");
            System.out.println("Root 2 = " + real + " - " + imag + "i");
        }
    }
}
