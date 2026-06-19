package jala.constructors;

/**
 * Assignment-12: Constructors
 * Task 2: Parent class constructors
 * Author: Anil Jagari
 */
public class Parent {

    // =====================================================
    // Instance Variables
    // =====================================================
    String companyName;
    String location;
    int    experience;

    // =====================================================
    // Default Constructor
    // =====================================================
    public Parent() {
        companyName = "JALA Academy";
        location    = "Hyderabad";
        experience  = 0;
        System.out.println("Parent → Default Constructor called");
        System.out.println("  companyName : " + companyName);
        System.out.println("  location    : " + location);
        System.out.println("  experience  : " + experience);
    }

    // =====================================================
    // One Argument Constructor
    // =====================================================
    public Parent(String companyName) {
        this.companyName = companyName;
        this.location    = "Hyderabad";
        this.experience  = 0;
        System.out.println("Parent → One-Arg Constructor called");
        System.out.println("  companyName : " + this.companyName);
        System.out.println("  location    : " + this.location);
    }

    // =====================================================
    // Two Argument Constructor
    // =====================================================
    public Parent(String companyName, String location) {
        this.companyName = companyName;
        this.location    = location;
        this.experience  = 0;
        System.out.println("Parent → Two-Arg Constructor called");
        System.out.println("  companyName : " + this.companyName);
        System.out.println("  location    : " + this.location);
    }

    // =====================================================
    // Three Argument Constructor
    // =====================================================
    public Parent(String companyName, String location, int experience) {
        this.companyName = companyName;
        this.location    = location;
        this.experience  = experience;
        System.out.println("Parent → Three-Arg Constructor called");
        System.out.println("  companyName : " + this.companyName);
        System.out.println("  location    : " + this.location);
        System.out.println("  experience  : " + this.experience);
    }

    // =====================================================
    // Parent method
    // =====================================================
    public void showParentInfo() {
        System.out.println("Parent → showParentInfo()");
        System.out.println("  companyName : " + companyName);
        System.out.println("  location    : " + location);
        System.out.println("  experience  : " + experience);
    }
}