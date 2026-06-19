package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * PUBLIC - accessible from ANYWHERE (any package, any class)
 * Author: Anil Jagari
 */
public class PublicExample {

    // =====================================================
    // PUBLIC fields → accessible from anywhere
    // =====================================================
    public String  instituteName = "JALA Academy";
    public String  location      = "Hyderabad";
    public int     established   = 2015;
    public boolean jobGuarantee  = true;

    // =====================================================
    // PUBLIC methods
    // =====================================================
    public void publicMethod() {
        System.out.println("===== Public Method in PublicExample =====");
        System.out.println("Institute    : " + instituteName);
        System.out.println("Location     : " + location);
        System.out.println("Established  : " + established);
        System.out.println("Job Guarantee: " + jobGuarantee);
    }

    public void showAccessInfo() {
        System.out.println("Public: accessible from any class, any package");
    }
}