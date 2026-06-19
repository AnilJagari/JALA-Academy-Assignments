package jala.constructors;

/**
 * Assignment-12: Constructors
 * Task 1: Default, One-arg, Two-arg constructors
 * Author: Anil Jagari
 */
public class MainClass {

    // =====================================================
    // Instance Variables
    // =====================================================
    String name;
    int    age;

    // =====================================================
    // Default Constructor (No-arg)
    // Called when no arguments are passed
    // =====================================================
    public MainClass() {
        name = "Default Name";
        age  = 0;
        System.out.println("MainClass → Default Constructor called");
        System.out.println("  name : " + name);
        System.out.println("  age  : " + age);
    }

    // =====================================================
    // One Argument Constructor
    // =====================================================
    public MainClass(String name) {
        this.name = name;
        this.age  = 0;
        System.out.println("MainClass → One-Arg Constructor called");
        System.out.println("  name : " + this.name);
        System.out.println("  age  : " + this.age);
    }

    // =====================================================
    // Two Argument Constructor
    // =====================================================
    public MainClass(String name, int age) {
        this.name = name;
        this.age  = age;
        System.out.println("MainClass → Two-Arg Constructor called");
        System.out.println("  name : " + this.name);
        System.out.println("  age  : " + this.age);
    }

    // =====================================================
    // Task 4: Constructor WITH return type
    // KEY POINT: This is NO LONGER a constructor
    // It becomes a REGULAR METHOD with constructor-like name
    // Constructors NEVER have return types
    // =====================================================
    public int MainClass(int value) {
        System.out.println("MainClass → int MainClass() : This is a METHOD not a constructor");
        System.out.println("  Constructors NEVER have return types");
        System.out.println("  Adding return type makes it a regular method");
        return value * 2;
    }

    public String MainClass(String value) {
        System.out.println("MainClass → String MainClass() : This is a METHOD not a constructor");
        System.out.println("  Return type makes it a regular method, not constructor");
        return "Returned: " + value;
    }

    // =====================================================
    // Show current state
    // =====================================================
    public void showInfo() {
        System.out.println("  [Object State] name=" + name + ", age=" + age);
    }
}