package jala.thisandsuper;

/**
 * Assignment-11: this and super
 * Parent Class
 * Author: Anil Jagari
 */
public class Parent {

    // =====================================================
    // Parent Instance Variables (fields)
    // =====================================================
    String name     = "Parent Name";
    int    age      = 40;
    String company  = "JALA Academy";
    String location = "Hyderabad";

    // =====================================================
    // Parent No-Arg Constructor
    // =====================================================
    public Parent() {
        System.out.println("Parent → No-Arg Constructor called");
        System.out.println("  name     : " + name);
        System.out.println("  age      : " + age);
        System.out.println("  company  : " + company);
        System.out.println("  location : " + location);
    }

    // =====================================================
    // Parent Argument Constructor
    // =====================================================
    public Parent(String name, int age, String company, String location) {
        // 'this' to distinguish local params from instance variables
        this.name     = name;
        this.age      = age;
        this.company  = company;
        this.location = location;
        System.out.println("Parent → Argument Constructor called");
        System.out.println("  name     : " + this.name);
        System.out.println("  age      : " + this.age);
        System.out.println("  company  : " + this.company);
        System.out.println("  location : " + this.location);
    }

    // =====================================================
    // Parent Methods
    // =====================================================
    public void showParentInfo() {
        System.out.println("Parent → showParentInfo()");
        System.out.println("  name     : " + name);
        System.out.println("  age      : " + age);
        System.out.println("  company  : " + company);
        System.out.println("  location : " + location);
    }

    public void parentMethod() {
        System.out.println("Parent → parentMethod() called");
    }
}