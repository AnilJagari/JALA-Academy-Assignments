package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * Accessing PROTECTED members from same package (no inheritance needed)
 * Author: Anil Jagari
 */
public class ProtectedSamePackageDemo {

    public static void main(String[] args) {

        ProtectedExample obj = new ProtectedExample();

        System.out.println("===== Accessing Protected Members - Same Package =====");

        // ✓ Direct access works → same package
        System.out.println("Course   : " + obj.courseName);
        System.out.println("Duration : " + obj.duration + " months");
        System.out.println("Fees     : " + obj.fees);

        // ✓ Calling protected method → same package
        obj.protectedMethod();
        obj.showAccessInfo();

        System.out.println("\nConclusion: Protected members accessible in same package.");
    }
}