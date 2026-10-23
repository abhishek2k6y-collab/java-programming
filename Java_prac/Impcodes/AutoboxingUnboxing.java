public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing:
        byte b = 10;
        Byte byteObj = b;

        short s = 20;
        Short shortObj = s;

        int i = 30;
        Integer intObj = i;

        long l = 40L;
        Long longObj = l;

        float f = 50.5f;
        Float floatObj = f;

        double d = 60.5;
        Double doubleObj = d;

        char c = 'A';
        Character charObj = c;

        boolean bool = true;
        Boolean booleanObj = bool;

        System.out.println("Autoboxing:");
        System.out.println("Byte      : " + byteObj);
        System.out.println("Short     : " + shortObj);
        System.out.println("Integer   : " + intObj);
        System.out.println("Long      : " + longObj);
        System.out.println("Float     : " + floatObj);
        System.out.println("Double    : " + doubleObj);
        System.out.println("Character : " + charObj);
        System.out.println("Boolean   : " + booleanObj);


        // Unboxing:
        byte b2 = byteObj;
        short s2 = shortObj;
        int i2 = intObj;
        long l2 = longObj;
        float f2 = floatObj;
        double d2 = doubleObj;
        char c2 = charObj;
        boolean bool2 = booleanObj;

        System.out.println("\nUnboxing:");
        System.out.println("byte      : " + b2);
        System.out.println("short     : " + s2);
        System.out.println("int       : " + i2);
        System.out.println("long      : " + l2);
        System.out.println("float     : " + f2);
        System.out.println("double    : " + d2);
        System.out.println("char      : " + c2);
        System.out.println("boolean   : " + bool2);
    }
}
