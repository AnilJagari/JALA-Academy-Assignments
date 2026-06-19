package jala.constructors;

/**
 * Assignment-12: Constructors - Main Demo
 * Author: Anil Jagari
 */
public class ConstructorDemo {

    public static void main(String[] args) {

        // =================================================
        // Task 1: Call all constructors of MainClass
        // =================================================
        System.out.println("================================================");
        System.out.println("  TASK 1: Default, One-Arg, Two-Arg Constructors ");
        System.out.println("================================================");

        System.out.println("\n--- Default Constructor ---");
        MainClass obj1 = new MainClass();
        obj1.showInfo();

        System.out.println("\n--- One-Arg Constructor ---");
        MainClass obj2 = new MainClass("Anil Jagari");
        obj2.showInfo();

        System.out.println("\n--- Two-Arg Constructor ---");
        MainClass obj3 = new MainClass("Ravi Kumar", 25);
        obj3.showInfo();

        // =================================================
        // Task 2: Call Parent constructors from Child
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 2: Parent Constructors via Child super()  ");
        System.out.println("================================================");

        System.out.println("\n--- Child Default → Parent Default ---");
        Child child1 = new Child();
        child1.showChildInfo();

        System.out.println("\n--- Child One-Arg → Parent One-Arg ---");
        Child child2 = new Child("Sita Devi");
        child2.showChildInfo();

        System.out.println("\n--- Child Two-Arg → Parent Two-Arg ---");
        Child child3 = new Child("Gita Sharma", "Python");
        child3.showChildInfo();

        System.out.println("\n--- Child Three-Arg → Parent Three-Arg ---");
        Child child4 = new Child("Mohan Rao", "DevOps", 4);
        child4.showChildInfo();

        // =================================================
        // Task 3: Access Modifier Constructors
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 3: Access Modifier Constructors           ");
        System.out.println("================================================");

        // PUBLIC → accessible from anywhere
        System.out.println("\n--- PUBLIC Constructor ---");
        AccessModifierConstructors pubObj =
                new AccessModifierConstructors("Public Access");

        // PROTECTED → accessible in same package
        System.out.println("\n--- PROTECTED Constructor ---");
        AccessModifierConstructors protObj =
                new AccessModifierConstructors("Protected Access", 30);

        // DEFAULT → accessible in same package
        System.out.println("\n--- DEFAULT Constructor ---");
        AccessModifierConstructors defObj =
                new AccessModifierConstructors(75000.00);

        // PRIVATE → only via static factory method
        System.out.println("\n--- PRIVATE Constructor (via factory method) ---");
        AccessModifierConstructors privObj =
                AccessModifierConstructors.createInstance(999);

        // Cannot call private directly → COMPILE ERROR if uncommented:
        // AccessModifierConstructors err = new AccessModifierConstructors(1); // ERROR

        // =================================================
        // Task 4: Constructors WITH return type
        //         → Become regular methods, NOT constructors
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 4: Constructor WITH Return Type           ");
        System.out.println("          (Becomes a METHOD, not a constructor)  ");
        System.out.println("================================================");

        MainClass obj4 = new MainClass("Test", 20);

        // Calling method that LOOKS like constructor but has return type
        System.out.println("\n--- int return type 'constructor' ---");
        int intResult = obj4.MainClass(10);
        System.out.println("  Returned value : " + intResult);

        System.out.println("\n--- String return type 'constructor' ---");
        String strResult = obj4.MainClass("JALA Academy");
        System.out.println("  Returned value : " + strResult);

        System.out.println("\n  KEY POINT:");
        System.out.println("  Real Constructor   → no return type, called via 'new'");
        System.out.println("  Method named same  → has return type, called on object");
        System.out.println("  They are completely different things");

        // =================================================
        // Task 5: Calling constructor multiple times
        //         with same object → NOT POSSIBLE
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 5: Constructor Called Multiple Times?     ");
        System.out.println("================================================");

        System.out.println("\n--- Attempt to call constructor again ---");
        AccessModifierConstructors sameObj =
                new AccessModifierConstructors("First Creation");

        // Cannot call constructor again on sameObj
        // sameObj.AccessModifierConstructors("Again"); // ERROR: method not found

        sameObj.tryCallingConstructorAgain();

        System.out.println("\n--- Proving constructor runs only ONCE per object ---");
        System.out.println("Object 1 created → constructor ran once");
        AccessModifierConstructors o1 = new AccessModifierConstructors("Object 1");
        System.out.println("Object 2 created → constructor ran once for this new object");
        AccessModifierConstructors o2 = new AccessModifierConstructors("Object 2");
        System.out.println("o1 and o2 are separate objects:");
        System.out.println("  o1.type : " + o1.type);
        System.out.println("  o2.type : " + o2.type);

        // =================================================
        // SUMMARY
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  SUMMARY                                        ");
        System.out.println("================================================");
        System.out.println("Constructor       → same name as class, NO return type");
        System.out.println("Default           → no-arg, JVM provides if none defined");
        System.out.println("One-arg/Two-arg   → parameterized constructors");
        System.out.println("super()           → calls parent constructor, first line");
        System.out.println("this()            → calls same class constructor, first line");
        System.out.println("private constr    → Singleton pattern, only inside class");
        System.out.println("With return type  → becomes a METHOD, not constructor");
        System.out.println("Multiple calls    → constructor runs ONCE per 'new' keyword");
        System.out.println("new keyword       → always creates a NEW object");
    }
}