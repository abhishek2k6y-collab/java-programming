 /*public class SimpleInterest {

    void calculateSI(double principal, double rate, double time) {
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();

        obj.calculateSI(10000, 5, 2);
    }
}*/


public class SimpleInterest{
    public static void main(String[] args) {
        System.out.println("The principal Amount:"+ args[0]);
        System.out.println("The Rate of Interest:"+ args[1]);
        System.out.println("The time:"+ args[2]);
        int p=Integer.parseInt(args[0]);
        int r=Integer.parseInt(args[1]);
        int t=Integer.parseInt(args[2]);
        int SI=(p*r*t)/100;
        System.out.println("Simple Interest is:"+SI);
    }
}
