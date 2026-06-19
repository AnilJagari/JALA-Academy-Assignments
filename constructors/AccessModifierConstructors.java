package jala.constructors;

/**
 * Assignment-12: Constructors
 * Task 3: private, public, protected, default constructors
 * Author: Anil Jagari
 */
public class AccessModifierConstructors {

    String type;

    // =====================================================
    // PRIVATE Constructor
    // → Only accessible within this class
    // → Used in Singleton Pattern
    // =====================================================
    private AccessModifierConstructors(int value) {
        this.type = "PRIVATE constructor - value: " + value;
        System.out.println("AccessModifierConstructors → PRIVATE Constructor called");
        System.out.println("  " + type);
        System.out.println("  Only accessible INSIDE this class");
    }

    // =====================================================
    // PUBLIC Constructor
    // → Accessible from anywhere
    // =====================================================
    public AccessModifierConstructors(String name) {
        this.type = "PUBLIC constructor - name: " + name;
        System.out.println("AccessModifierConstructors → PUBLIC Constructor called");
        System.out.println("  " + type);
        System.out.println("  Accessible from ANYWHERE");
    }

    // =====================================================
    // PROTECTED Constructor
    // → Accessible in same package + child classes
    // =====================================================
    protected AccessModifierConstructors(String name, int age) {
        this.type = "PROTECTED constructor - name: " + name + ", age: " + age;
        System.out.println("AccessModifierConstructors → PROTECTED Constructor called");
        System.out.println("  " + type);
        System.out.println("  Accessible in same package + child classes");
    }

    // =====================================================
    // DEFAULT Constructor (no modifier)
    // → Accessible only in same package
    // =====================================================
    AccessModifierConstructors(double salary) {
        this.type = "DEFAULT constructor - salary: " + salary;
        System.out.println("AccessModifierConstructors → DEFAULT Constructor called");
        System.out.println("  " + type);
        System.out.println("  Accessible only in SAME PACKAGE");
    }

    // =====================================================
    // Static factory method to call private constructor
    // This is the only way to call private constructor
    // from outside the class (Singleton Pattern)
    // =====================================================
    public static AccessModifierConstructors createInstance(int value) {
        System.out.println("createInstance() → calling PRIVATE constructor internally");
        return new AccessModifierConstructors(value);   // private constructor called here
    }

    // =====================================================
    // Task 5: Try calling constructor multiple times
    //         with same object
    // → CANNOT call constructor again on existing object
    // → Constructor only runs during 'new' keyword
    // → Simulate by showing the rule clearly
    // =====================================================
    public void tryCallingConstructorAgain() {
        System.out.println("AccessModifierConstructors → tryCallingConstructorAgain()");
        System.out.println("  RULE: Constructor runs ONLY ONCE during object creation");
        System.out.println("  RULE: Cannot call constructor again on existing object");
        System.out.println("  RULE: 'new ClassName()' always creates a NEW object");
        System.out.println("  RULE: this() inside constructor is constructor chaining");
        System.out.println("        but still runs only during original object creation");

        // This creates a NEW object, not calling constructor on 'this'
        AccessModifierConstructors newObj = new AccessModifierConstructors("New Object");
        System.out.println("  Above line created a NEW object, not called constructor again");
        System.out.println("  Current object type : " + this.type);
        System.out.println("  New object type     : " + newObj.type);
    }
}