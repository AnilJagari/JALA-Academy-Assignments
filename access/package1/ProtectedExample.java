package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * PROTECTED - accessible in same package + subclasses in any package
 * Author: Anil Jagari
 */
public class ProtectedExample {

    // =====================================================
    // PROTECTED fields
    // Accessible: same package + child classes anywhere
    // =====================================================
    protected String  courseName   = "Full Stack Java";
    protected int     duration     = 6;
    protected double  fees         = 25000.00;

    // =====================================================
    // PROTECTED methods
    // =====================================================
    protected void protectedMethod() {
        System.out.println("===== Protected Method in ProtectedExample =====");
        System.out.println("Course   : " + courseName);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fees     : " + fees);
    }

    protected void showAccessInfo() {
        System.out.println("Protected: same package + subclasses anywhere");
    }
}