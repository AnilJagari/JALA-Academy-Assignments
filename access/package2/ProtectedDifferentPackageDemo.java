package jala.access.package2;

import jala.access.package1.ProtectedExample;

/**
 * Assignment-8: Access Modifiers
 * Trying to access PROTECTED from NON-CHILD class in DIFFERENT package
 * Author: Anil Jagari
 */
public class ProtectedDifferentPackageDemo {

    public static void main(String[] args) {

        ProtectedExample obj = new ProtectedExample();

        System.out.println("===== Non-Child Class - Different Package =====");

        // COMPILE ERROR if uncommented:
        // System.out.println(obj.courseName);  // ERROR: protected
        // System.out.println(obj.duration);    // ERROR: protected
        // obj.protectedMethod();               // ERROR: protected

        System.out.println("Conclusion:");
        System.out.println("Protected fields/methods are NOT accessible from");
        System.out.println("a non-child class in a different package.");
        System.out.println("Only child classes (via inheritance) can access them.");

        // ✓ Only public members are accessible here
        System.out.println("\nOnly public members of ProtectedExample can be accessed here.");
    }
}