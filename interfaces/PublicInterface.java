package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 8:  PUBLIC interface with fields and methods
 * Task 9:  Fields in interface are implicitly public static final
 * Task 10: Interface fields are always public static final
 * Task 11: Static final variable in interface
 *
 * KEY RULE: All fields in interface are:
 *           → public  (always)
 *           → static  (always)
 *           → final   (always - constants, cannot be changed)
 *
 * KEY RULE: All methods in interface are:
 *           → public abstract (by default)
 *           → OR default/static (explicitly declared)
 *
 * NOTE on Task 9: Interface itself CANNOT be private or protected
 *                 at top level. Only nested interfaces can be private.
 *                 Fields inside interface are ALWAYS public static final.
 * Author: Anil Jagari
 */
public interface PublicInterface {

    // =====================================================
    // Task 8 & 11: PUBLIC STATIC FINAL fields (constants)
    // All interface fields are implicitly public static final
    // Even if you don't write public static final → it is applied
    // =====================================================

    // Explicitly written
    public static final String  INSTITUTE_NAME = "JALA Academy";
    public static final String  LOCATION       = "Hyderabad";
    public static final int     ESTABLISHED    = 2015;

    // Implicitly public static final (no keywords needed)
    String  COURSE      = "Full Stack Java";   // → public static final
    int     DURATION    = 6;                   // → public static final
    double  FEES        = 25000.00;            // → public static final
    boolean GUARANTEE   = true;                // → public static final

    // Task 11: Static final variable (same as above in interface)
    static final int MAX_STUDENTS = 30;        // → public static final

    // =====================================================
    // Task 8: PUBLIC methods (abstract by default)
    // =====================================================
    void showDetails();
    void showCourseInfo();

    // Static method in interface (Java 8+)
    static void staticInterfaceMethod() {
        System.out.println("PublicInterface → staticInterfaceMethod()");
        System.out.println("Called directly on interface: PublicInterface.staticInterfaceMethod()");
    }

    // Default method in interface
    default void defaultInterfaceMethod() {
        System.out.println("PublicInterface → defaultInterfaceMethod()");
        System.out.println("Institute : " + INSTITUTE_NAME);
        System.out.println("Course    : " + COURSE);
        System.out.println("Fees      : " + FEES);
    }
}