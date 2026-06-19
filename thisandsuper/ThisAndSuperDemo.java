package jala.thisandsuper;

/**
 * Assignment-11: this and super - Demo
 * Author: Anil Jagari
 */
public class ThisAndSuperDemo {

    public static void main(String[] args) {

        // =================================================
        // Task 1 & 2: this and super for fields
        // =================================================
        System.out.println("================================================");
        System.out.println("  TASK 1: Print Child Fields using 'this'        ");
        System.out.println("================================================");

        Child child1 = new Child();
        System.out.println();
        child1.printUsingThis();

        System.out.println("\n================================================");
        System.out.println("  TASK 2: Print Parent Fields using 'super'      ");
        System.out.println("================================================");

        child1.printUsingSuper();

        // =================================================
        // Task 3: this() → No-arg calls no-arg constructor
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 3: this() - No-Arg Constructor Chain      ");
        System.out.println("================================================");

        // Child() → calls super() → Parent() no-arg
        System.out.println("Creating Child with no-arg constructor:");
        Child child2 = new Child();

        // =================================================
        // Task 4: this() → 2-arg calls 4-arg constructor
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 4: this() - Argument Constructor Chain    ");
        System.out.println("================================================");

        // Child(name, age) → this(name, age, course, duration)
        System.out.println("Creating Child with 2-arg constructor:");
        System.out.println("(internally calls 4-arg via this())");
        Child child3 = new Child("Anil Jagari", 25);

        // =================================================
        // Task 5: super() → calls Parent constructor
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 5: super() - Parent Constructor Call      ");
        System.out.println("================================================");

        // Child 4-arg → super(name,age,company,location) → Parent arg constructor
        System.out.println("Creating Child with 4-arg constructor:");
        System.out.println("(internally calls Parent's arg constructor via super())");
        Child child4 = new Child("Ravi Kumar", 28, "MERN Stack", 4);
        child4.showChildInfo();

        // =================================================
        // Task 6: this and super in methods
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  TASK 6: this and super in Methods               ");
        System.out.println("================================================");

        Child child5 = new Child("Sita Devi", 22, "QA Automation", 3);
        System.out.println();
        child5.thisAndSuperInMethods();

        // =================================================
        // SUMMARY
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  SUMMARY                                        ");
        System.out.println("================================================");
        System.out.println("this.field    → current class field");
        System.out.println("super.field   → parent class field");
        System.out.println("this.method() → current class method");
        System.out.println("super.method()→ parent class method");
        System.out.println("this()        → current class constructor (first line only)");
        System.out.println("super()       → parent class constructor  (first line only)");
        System.out.println("this() & super() → CANNOT both be first line in same constructor");
        System.out.println("In methods    → use this/super for fields and methods only");
    }
}