package jala.inheritance;

/**
 * Assignment-7: Inheritance
 * Class B - Sub class of A
 * Author: Anil Jagari
 */
public class B extends A {

    // =====================================================
    // Instance Variable (Data Member) for Polymorphism
    // Note: Same name as A → Data member is NOT overridden
    //       It is HIDDEN → reference type decides which is used
    // =====================================================
    String role = "I am Class B - Sub Class of A";

    // =====================================================
    // Method 1 - Specific to Class B only
    // =====================================================
    public void methodB1() {
        System.out.println("B → methodB1() : Method specific to Class B");
    }

    // =====================================================
    // Method 2 - Specific to Class B only
    // =====================================================
    public void methodB2() {
        System.out.println("B → methodB2() : Another method specific to Class B");
    }

    // =====================================================
    // Method 3 - Overrides A's display()
    // =====================================================
    @Override
    public void display() {
        System.out.println("B → display()  : Overridden method in Class B");
    }
}