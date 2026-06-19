package jala.inheritance;

/**
 * Assignment-7: Inheritance
 * Class A - Super Class (Parent)
 * Author: Anil Jagari
 */
public class A {

    // =====================================================
    // Instance Variable (Data Member) for Polymorphism
    // =====================================================
    String role = "I am Class A - Super Class";

    // =====================================================
    // Method 1 - Specific to Class A only
    // =====================================================
    public void methodA1() {
        System.out.println("A → methodA1() : Method specific to Class A");
    }

    // =====================================================
    // Method 2 - Specific to Class A only
    // =====================================================
    public void methodA2() {
        System.out.println("A → methodA2() : Another method specific to Class A");
    }

    // =====================================================
    // Method 3 - Override method (exists in A, B, C)
    // =====================================================
    public void display() {
        System.out.println("A → display()  : Overridden method in Class A");
    }
}