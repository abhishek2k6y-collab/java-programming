public class C_Methodoverload{
    int id;
    String name;
    int age;

    C_Methodoverload() {
        id = 1;
        name = "Abhishek";
        age = 20;
    }

    C_Methodoverload(int i, String n) {
        id = i;
        name = n;
        age = 20;
    }

    C_Methodoverload(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        C_Methodoverload s1 = new C_Methodoverload();
        s1.display();
        C_Methodoverload s2 = new C_Methodoverload(2, "Rahul");
        s2.display();
        C_Methodoverload s3 = new C_Methodoverload(3, "Aman", 21);
        s3.display();

    }
}


