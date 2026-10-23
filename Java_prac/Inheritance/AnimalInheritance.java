class Animal{
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void sleep(){
        System.out.println(name + " is sleeping.");
    }

    // Method to be overridden
    void sound(){
        System.out.println("Animal makes a sound.");
    }
}



class Dog extends Animal{
    String breed;

    Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    void bark(){
        System.out.println(name + " is barking: Woof Woof!");
    }

    void displayBreed(){
        System.out.println("Breed: " + breed);
    }

    // Method overriding
    @Override 
    void sound(){
        System.out.println(name + " says: Woof Woof!");
    }
}



class Cat extends Animal{
    String color;

    Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    void meow(){
        System.out.println(name + " is saying: Meow Meow!");
    }

    void displayColor(){
        System.out.println("Color: " + color);
    }

    // Method overriding
    @Override
    void sound(){
        System.out.println(name + " says: Meow Meow!");
    }
}


class Bird extends Animal{
    double wingspan;

    Bird(String name, int age, double wingspan){
        super(name, age);
        this.wingspan = wingspan;
    }

    void fly(){
        System.out.println(name + " is flying.");
    }

    void displayWingspan(){
        System.out.println("Wingspan: " + wingspan + " cm");
    }

    // Method overriding
    @Override
    void sound(){
        System.out.println(name + " says: Chirp Chirp!");
    }
}


public class AnimalInheritance{
    public static void main(String[] args){

        Dog dog = new Dog("Bruno", 3, "Labrador");
        System.out.println("----- DOG INFORMATION -----");
        dog.displayInfo();
        dog.displayBreed();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.sound();
        System.out.println();

        
        Cat cat = new Cat("Kitty", 2, "White");
        System.out.println("----- CAT INFORMATION -----");
        cat.displayInfo();
        cat.displayColor();
        cat.eat();
        cat.sleep();
        cat.meow();
        cat.sound();
        System.out.println();

        Bird bird = new Bird("Tweety", 1, 25.5);
        System.out.println("----- BIRD INFORMATION -----");
        bird.displayInfo();
        bird.displayWingspan();
        bird.eat();
        bird.sleep();
        bird.fly();
        bird.sound();
    }
}