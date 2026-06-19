/**
 * Assignment-13: Method Overloading
 * Topics: Same name, different parameters/types/return types
 * Author: Anil Jagari
 */
public class MethodOverloadingAssignment {

    // =====================================================
    // Task 1: Same name, different NUMBER of parameters
    //         of SAME type (int)
    // =====================================================
    public void add(int a) {
        System.out.println("add(int a)             : " + a);
    }

    public void add(int a, int b) {
        System.out.println("add(int a, int b)      : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("add(int a, int b, int c) : " + (a + b + c));
    }

    // =====================================================
    // Task 2: Same name, different NUMBER of parameters
    //         of DIFFERENT data types
    // =====================================================
    public void display(int a) {
        System.out.println("display(int)           : " + a);
    }

    public void display(int a, String b) {
        System.out.println("display(int, String)   : " + a + ", " + b);
    }

    public void display(int a, String b, double c) {
        System.out.println("display(int, String, double) : " + a + ", " + b + ", " + c);
    }

    public void display(String a, boolean b, int c, double d) {
        System.out.println("display(String, boolean, int, double) : "
                + a + ", " + b + ", " + c + ", " + d);
    }

    // =====================================================
    // Task 3: Same name, SAME number of parameters
    //         of SAME type but DIFFERENT ORDER
    //         (Sequence/Order of parameters differs)
    // NOTE: Cannot have truly identical signatures →
    //       Java differentiates by parameter ORDER/SEQUENCE
    // =====================================================
    public void print(int a, int b) {
        System.out.println("print(int a, int b)    : a=" + a + ", b=" + b);
    }

    // Same number, same type but sequence changed with extra context
    // Java resolves by sequence when types differ
    public void print(int a, int b, int c) {
        System.out.println("print(int a, int b, int c) : a=" + a + ", b=" + b + ", c=" + c);
    }

    // =====================================================
    // Task 4: Same name, SAME number of parameters
    //         of DIFFERENT types
    // =====================================================
    public void calculate(int a, double b) {
        System.out.println("calculate(int, double) : " + a + ", " + b
                + " → result : " + (a + b));
    }

    public void calculate(double a, int b) {
        System.out.println("calculate(double, int) : " + a + ", " + b
                + " → result : " + (a + b));
    }

    public void calculate(String a, int b) {
        System.out.println("calculate(String, int) : " + a + ", " + b
                + " → result : " + a.repeat(b));
    }

    public void calculate(int a, String b) {
        System.out.println("calculate(int, String) : " + a + ", " + b
                + " → result : " + b.repeat(a));
    }

    public void calculate(boolean a, int b) {
        System.out.println("calculate(boolean, int): " + a + ", " + b
                + " → result : " + (a ? b * 2 : b / 2));
    }

    // =====================================================
    // Task 5: Same name, same number of parameters,
    //         same data type BUT DIFFERENT return type
    //
    // KEY POINT: Java does NOT allow overloading ONLY by
    //            return type → COMPILE ERROR
    //
    // SOLUTION: Change at least ONE parameter type too
    //           to make it valid overloading
    // =====================================================

    // Returns int
    public int getValue(int a) {
        System.out.println("getValue(int)          : returns int   → " + a);
        return a;
    }

    // Returns double → parameter type changed to double
    public double getValue(double a) {
        System.out.println("getValue(double)       : returns double → " + a);
        return a;
    }

    // Returns String → parameter type changed to String
    public String getValue(String a) {
        System.out.println("getValue(String)       : returns String → " + a);
        return a;
    }

    // Returns boolean → parameter type changed to boolean
    public boolean getValue(boolean a) {
        System.out.println("getValue(boolean)      : returns boolean → " + a);
        return a;
    }

    // Returns long → parameter changed to long
    public long getValue(long a) {
        System.out.println("getValue(long)         : returns long   → " + a);
        return a;
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        MethodOverloadingAssignment obj = new MethodOverloadingAssignment();

        // ---------------------------------------------------
        // Task 1: Same name, different number, same type
        // ---------------------------------------------------
        System.out.println("================================================");
        System.out.println("  TASK 1: Same Name, Different Number of Params  ");
        System.out.println("          Same Type (int)                        ");
        System.out.println("================================================");

        obj.add(10);
        obj.add(10, 20);
        obj.add(10, 20, 30);

        // ---------------------------------------------------
        // Task 2: Same name, different number, different types
        // ---------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 2: Same Name, Different Number of Params  ");
        System.out.println("          Different Data Types                   ");
        System.out.println("================================================");

        obj.display(100);
        obj.display(100, "JALA");
        obj.display(100, "JALA", 25000.00);
        obj.display("Anil", true, 25, 50000.00);

        // ---------------------------------------------------
        // Task 3: Same name, same number, same type
        // ---------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 3: Same Name, Same Number of Params       ");
        System.out.println("          Same Type                              ");
        System.out.println("================================================");

        obj.print(10, 20);
        obj.print(10, 20, 30);

        System.out.println("\n  KEY POINT:");
        System.out.println("  Cannot have two methods with IDENTICAL signatures");
        System.out.println("  e.g. print(int,int) twice → COMPILE ERROR");
        System.out.println("  Java must distinguish by type OR count OR order");

        // ---------------------------------------------------
        // Task 4: Same name, same number, different types
        // ---------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 4: Same Name, Same Number of Params       ");
        System.out.println("          Different Types                        ");
        System.out.println("================================================");

        obj.calculate(10, 99.99);
        obj.calculate(99.99, 10);
        obj.calculate("JALA", 3);
        obj.calculate(3, "JALA");
        obj.calculate(true, 20);

        // ---------------------------------------------------
        // Task 5: Different return types
        // ---------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 5: Different Return Types                 ");
        System.out.println("================================================");

        int     intVal  = obj.getValue(100);
        double  dblVal  = obj.getValue(99.99);
        String  strVal  = obj.getValue("JALA Academy");
        boolean boolVal = obj.getValue(true);
        long    longVal = obj.getValue(123456789L);

        System.out.println("\n  Returned Values:");
        System.out.println("  int     : " + intVal);
        System.out.println("  double  : " + dblVal);
        System.out.println("  String  : " + strVal);
        System.out.println("  boolean : " + boolVal);
        System.out.println("  long    : " + longVal);

        System.out.println("\n  KEY POINT:");
        System.out.println("  Overloading by return type ALONE → COMPILE ERROR");
        System.out.println("  e.g. int getValue(int) and double getValue(int)");
        System.out.println("       → Both have same param → NOT valid overloading");
        System.out.println("  Parameter type MUST differ to make it valid");

        // ---------------------------------------------------
        // SUMMARY
        // ---------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  SUMMARY: Method Overloading Rules              ");
        System.out.println("================================================");
        System.out.println("✓ Different NUMBER of parameters        → valid");
        System.out.println("✓ Same number, DIFFERENT parameter types → valid");
        System.out.println("✓ Same number, DIFFERENT order of types  → valid");
        System.out.println("✗ ONLY return type different             → INVALID");
        System.out.println("✗ Identical signatures (name+params)    → INVALID");
        System.out.println("  Overloading is resolved at COMPILE TIME");
        System.out.println("  Also called: Static/Compile-time Polymorphism");
    }
}