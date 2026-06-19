package jala.thisandsuper;

/**
 * Assignment-11: this and super
 * Child Class extends Parent
 * Author: Anil Jagari
 */
public class Child extends Parent {

    // =====================================================
    // Child Instance Variables
    // Same name fields as Parent → to show this vs super
    // =====================================================
    String name     = "Child Name";     // hides Parent's name
    int    age      = 25;               // hides Parent's age
    String course   = "Full Stack Java";
    int    duration = 6;

    // =====================================================
    // No-Arg Constructor
    // Task 3: this() → calls current class constructor
    // Task 5: super() → calls parent class constructor
    // =====================================================
    public Child() {
        // super() MUST be first statement if used
        // Calls Parent's no-arg constructor
        super();
        System.out.println("\nChild → No-Arg Constructor called");
        System.out.println("  name     : " + name);
        System.out.println("  age      : " + age);
        System.out.println("  course   : " + course);
        System.out.println("  duration : " + duration);
    }

    // =====================================================
    // Argument Constructor 1 (name, age)
    // Task 4: Calling another constructor of same class
    //         using this(name, age, course, duration)
    // =====================================================
    public Child(String name, int age) {
        // this() → calls Child's 4-arg constructor
        // MUST be first statement
        this(name, age, "Full Stack Java", 6);
        System.out.println("Child → 2-Arg Constructor (name, age) called");
    }

    // =====================================================
    // Argument Constructor 2 (all fields)
    // Task 5: super(name, age) → calls Parent's arg constructor
    // =====================================================
    public Child(String name, int age, String course, int duration) {
        // Calls Parent's argument constructor
        super(name, age, "JALA Academy", "Hyderabad");
        // Now set Child's own fields
        this.name     = name;
        this.age      = age;
        this.course   = course;
        this.duration = duration;
        System.out.println("\nChild → 4-Arg Constructor called");
        System.out.println("  name     : " + this.name);
        System.out.println("  age      : " + this.age);
        System.out.println("  course   : " + this.course);
        System.out.println("  duration : " + this.duration);
    }

    // =====================================================
    // Task 1: Print Child's fields using 'this'
    //         'this' refers to current class object
    //         No need to create object → used inside method
    // =====================================================
    public void printUsingThis() {
        System.out.println("Child → printUsingThis()");
        System.out.println("  this.name     : " + this.name);
        System.out.println("  this.age      : " + this.age);
        System.out.println("  this.course   : " + this.course);
        System.out.println("  this.duration : " + this.duration);

        // Without 'this' → same result when no name conflict
        System.out.println("\n  Without this keyword:");
        System.out.println("  name     : " + name);
        System.out.println("  age      : " + age);
        System.out.println("  course   : " + course);
        System.out.println("  duration : " + duration);
    }

    // =====================================================
    // Task 2: Print Parent's fields using 'super'
    //         'super' refers to parent class members
    // =====================================================
    public void printUsingSuper() {
        System.out.println("Child → printUsingSuper()");

        // Child's fields (this)
        System.out.println("  Child  - this.name     : " + this.name);
        System.out.println("  Child  - this.age      : " + this.age);

        // Parent's fields (super)
        System.out.println("  Parent - super.name    : " + super.name);
        System.out.println("  Parent - super.age     : " + super.age);
        System.out.println("  Parent - super.company : " + super.company);
        System.out.println("  Parent - super.location: " + super.location);

        // Call Parent's method using super
        System.out.println("\n  Calling Parent method using super:");
        super.showParentInfo();
        super.parentMethod();
    }

    // =====================================================
    // Task 6: Use this() and super() in METHODS
    //         this() and super() cannot be called in methods
    //         directly as constructor calls → show the rule
    //         Instead → use 'this' and 'super' for field/method access
    // =====================================================
    public void thisAndSuperInMethods() {
        System.out.println("Child → thisAndSuperInMethods()");

        // 'this' in method → refers to current object's fields/methods
        System.out.println("\n  Using 'this' in method:");
        System.out.println("  this.name     : " + this.name);
        System.out.println("  this.course   : " + this.course);
        this.printUsingThis();   // calling own method using this

        // 'super' in method → refers to parent's fields/methods
        System.out.println("\n  Using 'super' in method:");
        System.out.println("  super.name    : " + super.name);
        System.out.println("  super.company : " + super.company);
        super.showParentInfo();  // calling parent's method using super
        super.parentMethod();    // calling parent's method using super

        // IMPORTANT NOTE:
        // this() → constructor call → ONLY inside constructors, FIRST line
        // super() → constructor call → ONLY inside constructors, FIRST line
        // In methods → use 'this.field' and 'super.field' for access
        System.out.println("\n  NOTE: this() and super() as constructor calls");
        System.out.println("  are ONLY allowed inside constructors as first statement.");
        System.out.println("  In methods, use 'this' and 'super' for field/method access.");
    }

    // =====================================================
    // Child's own method
    // =====================================================
    public void showChildInfo() {
        System.out.println("Child → showChildInfo()");
        System.out.println("  name     : " + this.name);
        System.out.println("  age      : " + this.age);
        System.out.println("  course   : " + this.course);
        System.out.println("  duration : " + this.duration);
    }
}