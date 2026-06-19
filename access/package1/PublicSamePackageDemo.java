package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * Accessing PUBLIC members from same package
 * Author: Anil Jagari
 */
public class PublicSamePackageDemo {

    public static void main(String[] args) {

        PublicExample obj = new PublicExample();

        System.out.println("===== Accessing Public Members - Same Package =====");

        // ✓ Direct access works → public
        System.out.println("Institute    : " + obj.instituteName);
        System.out.println("Location     : " + obj.location);
        System.out.println("Established  : " + obj.established);
        System.out.println("Job Guarantee: " + obj.jobGuarantee);

        // ✓ Calling public method
        obj.publicMethod();
        obj.showAccessInfo();
    }
}