package jala.access.package2;

import jala.access.package1.PublicExample;

/**
 * Assignment-8: Access Modifiers
 * Accessing PUBLIC members from a DIFFERENT package
 * Author: Anil Jagari
 */
public class PublicDifferentPackageDemo {

    public static void main(String[] args) {

        PublicExample obj = new PublicExample();

        System.out.println("===== Accessing Public Members - Different Package =====");

        // ✓ All public fields directly accessible
        System.out.println("Institute    : " + obj.instituteName);
        System.out.println("Location     : " + obj.location);
        System.out.println("Established  : " + obj.established);
        System.out.println("Job Guarantee: " + obj.jobGuarantee);

        // ✓ All public methods callable
        obj.publicMethod();
        obj.showAccessInfo();

        System.out.println("\nConclusion: Public members accessible from ANY package.");
    }
}