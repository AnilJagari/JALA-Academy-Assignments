package jala.access.package2;

import jala.access.package1.ProtectedExample;

/**
 * Assignment-8: Access Modifiers
 * Accessing PROTECTED members from CHILD CLASS in DIFFERENT package
 * Author: Anil Jagari
 */
public class ProtectedChild extends ProtectedExample {

    public void accessProtectedViaInheritance() {

        System.out.println("===== Protected Members via Inheritance (Different Package) =====");

        // ✓ Works → child class can access protected via inheritance
        System.out.println("Course   : " + courseName);
        System.out.println("Duration : " + duration + " months");
        System.out.println("Fees     : " + fees);

        // ✓ Calling protected method via inheritance
        protectedMethod();
        showAccessInfo();

        System.out.println("\nConclusion: Protected accessible in child class from different package.");
    }

    public void tryDirectObjectAccess() {

        System.out.println("\n===== Direct Object Access - Different Package =====");

        // COMPILE ERROR if uncommented:
        // ProtectedExample obj = new ProtectedExample();
        // System.out.println(obj.courseName);   // ERROR: not via inheritance
        // obj.protectedMethod();                 // ERROR: not via inheritance

        System.out.println("Direct object access to protected → NOT allowed in different package.");
        System.out.println("Only inheritance access is allowed from different package.");
    }

    public static void main(String[] args) {
        ProtectedChild child = new ProtectedChild();
        child.accessProtectedViaInheritance();
        child.tryDirectObjectAccess();
    }
}