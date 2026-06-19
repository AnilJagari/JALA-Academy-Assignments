package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * Accessing DEFAULT members from another class in SAME package
 * Author: Anil Jagari
 */
public class DefaultAccessDemo {

    public static void main(String[] args) {

        DefaultExample obj = new DefaultExample();

        System.out.println("===== Accessing Default Members - Same Package =====");

        // ✓ Direct access works → same package
        System.out.println("Company : " + obj.companyName);
        System.out.println("Seats   : " + obj.totalSeats);
        System.out.println("Fee     : " + obj.courseFee);

        // ✓ Calling default method → same package
        obj.defaultMethod();
        obj.showPackageInfo();

        System.out.println("\nConclusion: Default members accessible within same package.");
    }
}