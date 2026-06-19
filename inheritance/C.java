package jala.inheritance;

/**
 * Assignment-7: Inheritance
 * Class C - Sub class of B (grandchild of A)
 * Author: Anil Jagari
 */
public class C extends B {

    // =====================================================
    // Instance Variable (Data Member) for Polymorphism
    // =====================================================
    String role = "I am Class C - Sub Class of B";

    // =====================================================
    // Method 1 - Specific to Class C only
    // =====================================================
    public void methodC1() {
        System.out.println("C → methodC1() : Method specific to Class C");
    }

    // =====================================================
    // Method 2 - Specific to Class C only
    // =====================================================
    public void methodC2() {
        System.out.println("C → methodC2() : Another method specific to Class C");
    }

    // =====================================================
    // Method 3 - Overrides B's display() (and A's too)
    // =====================================================
    @Override
    public void display() {
        System.out.println("C → display()  : Overridden method in Class C");
    }
}