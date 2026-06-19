package jala.interfaces;

/**
 * Assignment-10: Interfaces - Main Demo Class
 * Implements and demonstrates ALL interface tasks
 * Author: Anil Jagari
 */

// =========================================================
// Task 1: Implementing InterfaceOne (one method)
// =========================================================
class GreetingClass implements InterfaceOne {

    @Override
    public void greet() {
        System.out.println("GreetingClass → greet() : Hello from JALA Academy!");
    }
}

// =========================================================
// Task 2: Implementing ONLY ONE method of PartialInterface
//         → Class MUST be abstract (cannot instantiate)
// =========================================================
abstract class PartialImpl implements PartialInterface {

    @Override
    public void methodOne() {
        System.out.println("PartialImpl → methodOne() : Implemented!");
    }
    // methodTwo() NOT implemented → class is abstract
}

// Concrete subclass to use PartialImpl
class PartialConcrete extends PartialImpl {

    @Override
    public void methodTwo() {
        System.out.println("PartialConcrete → methodTwo() : Implemented in concrete class");
    }
}

// =========================================================
// Task 4 & 5: Implementing TWO interfaces in ONE class
//             Both interfaces have commonMethod() → only ONE implementation
// =========================================================
class MultiInterfaceClass implements InterfaceA, InterfaceB {

    // Task 4: unique method from InterfaceA
    @Override
    public void methodFromA() {
        System.out.println("MultiInterfaceClass → methodFromA() : From InterfaceA");
    }

    // Task 4: unique method from InterfaceB
    @Override
    public void methodFromB() {
        System.out.println("MultiInterfaceClass → methodFromB() : From InterfaceB");
    }

    // Task 5: ONE implementation serves BOTH interfaces
    // No conflict → Java allows this cleanly
    @Override
    public void commonMethod() {
        System.out.println("MultiInterfaceClass → commonMethod() : Serves both InterfaceA and InterfaceB");
    }
}

// =========================================================
// Task 6: Implementing ParentInterface
//         defaultMethod() NOT overridden → uses interface's default
// =========================================================
class ParentInterfaceImpl implements ParentInterface {

    @Override
    public void abstractMethod() {
        System.out.println("ParentInterfaceImpl → abstractMethod() : Implemented!");
    }
    // defaultMethod() and showInterfaceInfo() NOT overridden
    // → ParentInterface's default versions will run
}

// =========================================================
// Task 7: Implementing ChildInterface
//         ChildInterface extends ParentInterface
//         → Must implement all abstract methods from both
// =========================================================
class ChildInterfaceImpl implements ChildInterface {

    @Override
    public void abstractMethod() {
        System.out.println("ChildInterfaceImpl → abstractMethod() : From ParentInterface");
    }

    @Override
    public void childMethod() {
        System.out.println("ChildInterfaceImpl → childMethod()    : From ChildInterface");
    }
    // defaultMethod() → uses ParentInterface's default
    // showInterfaceInfo() → uses ChildInterface's overridden default
}

// =========================================================
// Task 8 & 11: Implementing PublicInterface
//              Print interface field values + call methods
// =========================================================
class PublicInterfaceImpl implements PublicInterface {

    @Override
    public void showDetails() {
        System.out.println("PublicInterfaceImpl → showDetails()");
        // Accessing interface constants
        System.out.println("  Institute  : " + INSTITUTE_NAME);
        System.out.println("  Location   : " + LOCATION);
        System.out.println("  Established: " + ESTABLISHED);
        System.out.println("  Guarantee  : " + GUARANTEE);
        System.out.println("  Max Students:" + MAX_STUDENTS);
    }

    @Override
    public void showCourseInfo() {
        System.out.println("PublicInterfaceImpl → showCourseInfo()");
        System.out.println("  Course   : " + COURSE);
        System.out.println("  Duration : " + DURATION + " months");
        System.out.println("  Fees     : " + FEES);
    }
}

// =========================================================
// Task 11: Implementing StaticFinalInterface
// =========================================================
class StaticFinalImpl implements StaticFinalInterface {

    @Override
    public void showConstants() {
        System.out.println("StaticFinalImpl → showConstants()");
        System.out.println("  PI       : " + PI);
        System.out.println("  MAX_SIZE : " + MAX_SIZE);
        System.out.println("  APP_NAME : " + APP_NAME);
        System.out.println("  VERSION  : " + VERSION);
        System.out.println("  TIMEOUT  : " + TIMEOUT);

        // Try to change → COMPILE ERROR (final)
        // PI = 3.14;  // ERROR: cannot assign to final variable
    }
}

// =========================================================
// MAIN CLASS
// =========================================================
public class InterfaceDemo {

    public static void main(String[] args) {

        // -----------------------------------------------------
        // Task 1: One method interface + call via own object
        // -----------------------------------------------------
        System.out.println("================================================");
        System.out.println("  TASK 1: Single Method Interface                ");
        System.out.println("================================================");

        GreetingClass greet = new GreetingClass();
        greet.greet();

        // Task 3: Interface instance (reference) to call method
        System.out.println("\n--- Task 3: Interface Reference → call method ---");
        InterfaceOne interfaceRef = new GreetingClass();
        interfaceRef.greet();   // ✓ Interface reference calling implemented method

        // -----------------------------------------------------
        // Task 2: Partial implementation
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 2: Partial Interface Implementation       ");
        System.out.println("================================================");

        PartialConcrete partial = new PartialConcrete();
        partial.methodOne();   // implemented in PartialImpl
        partial.methodTwo();   // implemented in PartialConcrete

        // Cannot instantiate PartialImpl → it's abstract
        // PartialImpl p = new PartialImpl();  // ERROR

        // -----------------------------------------------------
        // Task 4 & 5: Two interfaces, one class, same method
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 4 & 5: Two Interfaces - One Class         ");
        System.out.println("================================================");

        MultiInterfaceClass multi = new MultiInterfaceClass();
        multi.methodFromA();   // Task 4: from InterfaceA
        multi.methodFromB();   // Task 4: from InterfaceB
        multi.commonMethod();  // Task 5: same signature in both → one implementation

        // Task 3 extended: Interface references for multi
        System.out.println("\n--- Interface References ---");
        InterfaceA refA = new MultiInterfaceClass();
        InterfaceB refB = new MultiInterfaceClass();
        refA.commonMethod();   // calls same implementation
        refB.commonMethod();   // calls same implementation

        // -----------------------------------------------------
        // Task 6: Default method → no override needed
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 6: Default Method - No Override           ");
        System.out.println("================================================");

        ParentInterfaceImpl parentImpl = new ParentInterfaceImpl();
        parentImpl.abstractMethod();    // implemented in class
        parentImpl.defaultMethod();     // uses interface's default → no override needed
        parentImpl.showInterfaceInfo(); // uses interface's default

        // -----------------------------------------------------
        // Task 7: Child interface inheriting parent interface
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 7: Interface Inheritance                  ");
        System.out.println("================================================");

        ChildInterfaceImpl childImpl = new ChildInterfaceImpl();
        childImpl.abstractMethod();    // from ParentInterface
        childImpl.childMethod();       // from ChildInterface
        childImpl.defaultMethod();     // default from ParentInterface
        childImpl.showInterfaceInfo(); // overridden default in ChildInterface

        // Using Parent and Child interface references
        System.out.println("\n--- Parent Interface Reference → Child Impl ---");
        ParentInterface parentRef = new ChildInterfaceImpl();
        parentRef.abstractMethod();
        parentRef.defaultMethod();

        System.out.println("\n--- Child Interface Reference → Child Impl ---");
        ChildInterface childRef = new ChildInterfaceImpl();
        childRef.abstractMethod();
        childRef.childMethod();

        // -----------------------------------------------------
        // Task 8 & 11: Public interface fields and methods
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 8 & 11: Public Interface Fields/Methods   ");
        System.out.println("================================================");

        PublicInterfaceImpl pubImpl = new PublicInterfaceImpl();
        pubImpl.showDetails();
        pubImpl.showCourseInfo();
        pubImpl.defaultInterfaceMethod();   // default method

        // Access static method directly on interface (no object needed)
        System.out.println("\n--- Static Interface Method ---");
        PublicInterface.staticInterfaceMethod();

        // Access constants directly on interface (no object needed)
        System.out.println("\n--- Accessing Constants Directly ---");
        System.out.println("PublicInterface.INSTITUTE_NAME : " + PublicInterface.INSTITUTE_NAME);
        System.out.println("PublicInterface.MAX_STUDENTS   : " + PublicInterface.MAX_STUDENTS);

        // Task 9: Proving fields are always public (even without keyword)
        System.out.println("\n--- Task 9 & 10: Fields are always public static final ---");
        System.out.println("COURSE (implicit public static final)   : " + PublicInterface.COURSE);
        System.out.println("DURATION (implicit public static final) : " + PublicInterface.DURATION);

        // Try to change → COMPILE ERROR
        // PublicInterface.COURSE = "Python";  // ERROR: cannot assign to final

        // -----------------------------------------------------
        // Task 11: Static Final Interface constants
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  TASK 11: Static Final Variables                ");
        System.out.println("================================================");

        StaticFinalImpl staticImpl = new StaticFinalImpl();
        staticImpl.showConstants();

        // Access directly via interface name → no object needed
        System.out.println("\n--- Direct Access via Interface Name ---");
        System.out.println("StaticFinalInterface.PI       : " + StaticFinalInterface.PI);
        System.out.println("StaticFinalInterface.APP_NAME : " + StaticFinalInterface.APP_NAME);
        System.out.println("StaticFinalInterface.VERSION  : " + StaticFinalInterface.VERSION);

        // -----------------------------------------------------
        // SUMMARY
        // -----------------------------------------------------
        System.out.println("\n================================================");
        System.out.println("  SUMMARY                                        ");
        System.out.println("================================================");
        System.out.println("Interface fields   → always public static final (constants)");
        System.out.println("Interface methods  → public abstract by default");
        System.out.println("default method     → has body, no override needed");
        System.out.println("static method      → called on interface directly");
        System.out.println("Same method in 2   → ONE implementation in class");
        System.out.println("Interface ref      → can call interface methods only");
        System.out.println("Interface inherit  → extends (not implements)");
        System.out.println("Partial impl       → class must be abstract");
    }
}