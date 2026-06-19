package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * DEFAULT (Package-Private) - accessible within same package only
 * No keyword needed → just declare without modifier
 * Author: Anil Jagari
 */
public class DefaultExample {

    // =====================================================
    // DEFAULT fields → no access modifier keyword
    // Accessible only within jala.access.package1
    // =====================================================
    String companyName = "JALA Academy";
    int    totalSeats  = 30;
    double courseFee   = 15000.00;

    // =====================================================
    // DEFAULT method
    // =====================================================
    void defaultMethod() {
        System.out.println("===== Default Method in DefaultExample =====");
        System.out.println("Company  : " + companyName);
        System.out.println("Seats    : " + totalSeats);
        System.out.println("Fee      : " + courseFee);
    }

    void showPackageInfo() {
        System.out.println("Package  : jala.access.package1");
        System.out.println("Access   : Default (package-private)");
    }
}