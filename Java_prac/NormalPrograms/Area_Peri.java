import java.util.Scanner;

class perimeter{
       int square(int side){
           return 4*side;
       }

       Float circle(Float radius){
           return 2*3.14f*radius;
       }

       int rectangle(int length, int Breadth){
           return 2*(length+Breadth);
       }
}


class area{
       int square(int side){
           return side*side;
       }

       Float circle(Float radius){
           return 3.14f*radius*radius;
       }

       int rectangle(int length, int Breadth){
           return length*Breadth;
       }
}

public class Area_Peri {
   static {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter square Side:");
            int Side =sc.nextInt();
            System.out.print("Enter circle radius:");
            float radius=sc.nextFloat();
            System.out.print("Enter rectangle length:");
            int length=sc.nextInt();
            System.out.print("Enter rectangle Breadth:");
            int Breadth=sc.nextInt();
            
            perimeter obj= new perimeter();
            int x=obj.square(Side);
            System.out.println("Perimeter of Square is:"+ x);
            Float y=obj.circle(radius);
            System.out.println("Perimeter of circle is:"+ y);
            int z=obj.rectangle(length, Breadth);
            System.out.println("Perimeter of rectangle is:"+ z);

            area obc= new area();
            int a=obc.square(Side);
            System.out.println("area of Square is:"+ a);
            Float b=obc.circle(radius);
            System.out.println("area of circle is:"+ b);
            int c=obc.rectangle(length, Breadth);
            System.out.println("area of rectangle is:"+ c);
            sc.close();
        }
    }
    
}
