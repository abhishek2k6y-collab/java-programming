public class TypeConversion {
    public static void main(String[] args) {

        // Widening conversion
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println("Widening Conversion:");
        System.out.println("byte  = " + b);
        System.out.println("short = " + s);
        System.out.println("int   = " + i);
        System.out.println("long  = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);

        // Narrowing conversion
        double d1 = 100.50;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;
        short s1 = (short) i1;
        byte b1 = (byte) s1;
        char c1 = (char) i1;

        System.out.println("\nNarrowing Conversion:");
        System.out.println("double = " + d1);
        System.out.println("float  = " + f1);
        System.out.println("long   = " + l1);
        System.out.println("int    = " + i1);
        System.out.println("short  = " + s1);
        System.out.println("byte   = " + b1);
        System.out.println("char   = " + c1);
    }
}
    

