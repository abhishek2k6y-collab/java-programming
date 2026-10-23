import java.util.Scanner;

public class Getters_Setters {
    
    private double radius;
    private double height;

    public void SetRadius(double radius){
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }

    public void SetHeight(double height){
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    
    public double Circle_Area(){
        return Math.PI*radius*radius;
    }

    public double Circle_Peri(){
        return 2*Math.PI*radius;
    }
    
    public double Cylinder_Area(){
        return 2*Math.PI*radius*(radius + height);
    }
    
    public double Cylinder_Volume(){
        return Math.PI*radius*radius*height;
    }

    public void DisplayDetails(){
        System.out.println("----Circle----");
        System.out.println("Radius of circle:"+ radius);
        System.out.println("Area of Circle:"+ Circle_Area());
        System.out.println("Perimeter of Circle:"+ Circle_Peri());
        System.out.println("");
        System.out.println("----Cylinder----");
        System.out.println("Radius of Cylinder:"+radius);
        System.out.println("Height of Cylinder:"+height);
        System.out.println("TSA of Cylinder:"+ Cylinder_Area());
        System.out.println("Volume of Cylinder:"+ Cylinder_Volume());
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Circle & Cylinder Radius:");
            double radius=sc.nextDouble();
            System.out.print("Enter Cylinder Height:");
            double height=sc.nextDouble();
            Getters_Setters obj= new Getters_Setters();
            obj.SetRadius(radius);
            obj.SetHeight(height);
            obj.DisplayDetails();
        }
    }
}
