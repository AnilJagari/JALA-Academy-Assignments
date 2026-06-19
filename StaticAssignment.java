/**
 * Assignment-5: Static in Java
 * Topics: Static variables, Instance variables,
 *         Static methods, Instance methods
 * Author: Anil Jagari
 */
public class StaticAssignment {

    // =====================================================
    // Static Variables (belong to CLASS)
    // Shared across all objects
    // =====================================================
    static String companyName = "JALA Academy";
    static int    totalStudents = 500;

    // =====================================================
    // Instance Variables (belong to OBJECT)
    // Each object has its own copy
    // =====================================================
    String studentName = "Anil Jagari";
    int    studentAge  = 25;

    // =====================================================
    // Static Method 1
    // 2. Trying to print instance variables in static method
    //    → Need object to access instance variables
    // =====================================================
    public static void staticMethod1() {
        System.out.println("===== Static Method 1 =====");

        // Print static variables → directly accessible
        System.out.println("Static  - Company Name    : " + companyName);
        System.out.println("Static  - Total Students  : " + totalStudents);

        // Print instance variables → need object inside static method
        StaticAssignment obj = new StaticAssignment();
        System.out.println("Instance - Student Name   : " + obj.studentName);
        System.out.println("Instance - Student Age    : " + obj.studentAge);

        // 4. Call instance method from static method → need object
        System.out.println("\n--- Calling Instance Method from Static Method ---");
        obj.instanceMethod1();
    }

    // =====================================================
    // Static Method 2
    // =====================================================
    public static void staticMethod2() {
        System.out.println("\n===== Static Method 2 =====");
        System.out.println("Static  - Company Name   : " + companyName);
        System.out.println("Static  - Total Students : " + totalStudents);

        // Call instance method from static method
        StaticAssignment obj = new StaticAssignment();
        System.out.println("\n--- Calling Instance Method 2 from Static Method 2 ---");
        obj.instanceMethod2();
    }

    // =====================================================
    // Instance Method 1
    // 3. Print static variables in instance method
    //    → directly accessible, no object needed
    // =====================================================
    public void instanceMethod1() {
        System.out.println("===== Instance Method 1 =====");

        // Print instance variables
        System.out.println("Instance - Student Name   : " + studentName);
        System.out.println("Instance - Student Age    : " + studentAge);

        // Print static variables → directly accessible in instance method
        System.out.println("Static   - Company Name   : " + companyName);
        System.out.println("Static   - Total Students : " + totalStudents);

        // 5. Call static method from instance method → directly
        System.out.println("\n--- Calling Static Method from Instance Method ---");
        // Calling staticMethod2 would cause infinite loop here,
        // so we just demonstrate direct static variable access
        System.out.println("Static method can be called as: StaticAssignment.staticMethod2()");
    }

    // =====================================================
    // Instance Method 2
    // =====================================================
    public void instanceMethod2() {
        System.out.println("===== Instance Method 2 =====");

        // Print instance variables
        System.out.println("Instance - Student Name   : " + studentName);
        System.out.println("Instance - Student Age    : " + studentAge);

        // Print static variables in instance method
        System.out.println("Static   - Company Name   : " + companyName);
        System.out.println("Static   - Total Students : " + totalStudents);

        // 5. Call static methods from instance method
        System.out.println("\n--- Calling Static Method from Instance Method 2 ---");
        System.out.println("Company  : " + StaticAssignment.companyName);
        System.out.println("Students : " + StaticAssignment.totalStudents);
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        // -----------------------------------------------
        // 6. Print all static and instance variables
        // -----------------------------------------------
        System.out.println("========================================");
        System.out.println("       STATIC vs INSTANCE VARIABLES     ");
        System.out.println("========================================");

        // Static variables → access directly (no object needed)
        System.out.println("\n--- Static Variables ---");
        System.out.println("Company Name    : " + companyName);
        System.out.println("Total Students  : " + totalStudents);

        // Instance variables → need object
        StaticAssignment obj1 = new StaticAssignment();
        StaticAssignment obj2 = new StaticAssignment();

        // Give obj2 different values to show each object has its own copy
        obj2.studentName = "Ravi Kumar";
        obj2.studentAge  = 30;

        System.out.println("\n--- Instance Variables - Object 1 ---");
        System.out.println("Student Name : " + obj1.studentName);
        System.out.println("Student Age  : " + obj1.studentAge);

        System.out.println("\n--- Instance Variables - Object 2 ---");
        System.out.println("Student Name : " + obj2.studentName);
        System.out.println("Student Age  : " + obj2.studentAge);

        // Prove static variable is SHARED → change via obj1, shows in obj2
        System.out.println("\n--- Proving Static is Shared ---");
        System.out.println("Before change - Total Students : " + totalStudents);
        obj1.totalStudents = 600;   // change via obj1
        System.out.println("After  change via obj1 - obj2 sees : " + obj2.totalStudents);

        // -----------------------------------------------
        // 7. Call static and instance methods from main
        // -----------------------------------------------
        System.out.println("\n========================================");
        System.out.println("     CALLING STATIC & INSTANCE METHODS  ");
        System.out.println("========================================");

        // Static methods → call directly, no object needed
        System.out.println("\n--- Calling Static Methods ---");
        StaticAssignment.staticMethod1();
        StaticAssignment.staticMethod2();

        // Instance methods → need object
        System.out.println("\n--- Calling Instance Methods ---");
        obj1.instanceMethod1();
        obj1.instanceMethod2();
    }
}