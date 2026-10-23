//Experiment 18: A class Shape is defined with two overloading constructors in it.
//  Another class Test1 is partially defined which inherits the class Shape. 
// The class Test1 should include two overloading constructors as appropriate for some object instantiation. 
// You should define the constructors using the super class constructors. 
// Also, override the method calculate() in Test1 to calculate the volume of a Shape.

class Shape{
    int length;
    int breadth;
    int height;

    public Shape(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public Shape(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    public void calVolume(){
        System.out.println("This is a Shape.");       
    }
}

class Test1 extends Shape{

    public Test1(int length, int breadth){
        super(length, breadth);
    }

    public Test1(int length, int breadth, int height){
        super(length, breadth, height);
    }

    @Override
    public void calVolume(){
        int volume = length * breadth * height;
        System.out.println("Volume of Shape:"+ volume);
    }
}

public class VolShape {
    public static void main(String[] args) {
        
        Test1 s1 = new Test1(5, 7, 2);
        s1.calVolume();

        Test1 s2 = new Test1(6, 4);
        s2.calVolume();
    }
}
