package jala.inheritance;

/**
 * Assignment-7: Inheritance - Demo Class
 * Demonstrates:
 * 1. Object creation for A, B, C
 * 2. Calling every method using own object
 * 3. Runtime Polymorphism with methods
 * 4. Runtime Polymorphism with Data Members
 * Author: Anil Jagari
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        // =================================================
        // PART 1: Create objects for A, B, C
        //         Call every method using own object
        // =================================================

        System.out.println("================================================");
        System.out.println("  PART 1: Own Object Calling Own Methods        ");
        System.out.println("================================================");

        // Object of Class A → can call A's methods only
        A objA = new A();
        System.out.println("\n--- Class A Object ---");
        objA.methodA1();
        objA.methodA2();
        objA.display();

        // Object of Class B → can call B's methods + inherited A's methods
        B objB = new B();
        System.out.println("\n--- Class B Object ---");
        objB.methodA1();   // inherited from A
        objB.methodA2();   // inherited from A
        objB.methodB1();   // specific to B
        objB.methodB2();   // specific to B
        objB.display();    // B's overridden version

        // Object of Class C → can call C's methods + B's + A's methods
        C objC = new C();
        System.out.println("\n--- Class C Object ---");
        objC.methodA1();   // inherited from A
        objC.methodA2();   // inherited from A
        objC.methodB1();   // inherited from B
        objC.methodB2();   // inherited from B
        objC.methodC1();   // specific to C
        objC.methodC2();   // specific to C
        objC.display();    // C's overridden version

        // =================================================
        // PART 2: Runtime Polymorphism with Methods
        //         Super class reference → Sub class object
        //         JVM decides at RUNTIME which display() runs
        // =================================================

        System.out.println("\n================================================");
        System.out.println("  PART 2: Runtime Polymorphism - Methods        ");
        System.out.println("================================================");

        // Super class reference A → pointing to B's object
        // display() called → B's version runs (Runtime decision)
        A refA_B = new B();
        System.out.println("\n--- A reference → B object ---");
        refA_B.display();   // → B's display() runs   ✓ Runtime Polymorphism
        // refA_B.methodB1() → COMPILE ERROR: A reference can't see B's methods

        // Super class reference A → pointing to C's object
        A refA_C = new C();
        System.out.println("\n--- A reference → C object ---");
        refA_C.display();   // → C's display() runs   ✓ Runtime Polymorphism

        // B reference → pointing to C's object
        B refB_C = new C();
        System.out.println("\n--- B reference → C object ---");
        refB_C.display();   // → C's display() runs   ✓ Runtime Polymorphism
        refB_C.methodB1();  // → B's methodB1() (B reference can see B's methods)

        // All three in a loop to prove polymorphism clearly
        System.out.println("\n--- All references in array (Polymorphism loop) ---");
        A[] refs = new A[3];
        refs[0] = new A();   // A reference → A object
        refs[1] = new B();   // A reference → B object
        refs[2] = new C();   // A reference → C object

        for (int i = 0; i < refs.length; i++) {
            refs[i].display();  // JVM picks correct display() at runtime
        }

        // =================================================
        // PART 3: Runtime Polymorphism with Data Members
        //         Data members are NOT overridden → they are HIDDEN
        //         Reference type decides which 'role' is accessed
        //         (Compile time decision, NOT runtime)
        // =================================================

        System.out.println("\n================================================");
        System.out.println("  PART 3: Polymorphism with Data Members        ");
        System.out.println("================================================");

        System.out.println("\n--- Own reference → own data member ---");
        A ownA = new A();
        B ownB = new B();
        C ownC = new C();
        System.out.println("A object → role : " + ownA.role);  // A's role
        System.out.println("B object → role : " + ownB.role);  // B's role
        System.out.println("C object → role : " + ownC.role);  // C's role

        System.out.println("\n--- Super reference → Sub object (Data Members) ---");

        // KEY POINT:
        // For METHODS  → object type decides (Runtime Polymorphism)
        // For VARIABLES → reference type decides (NO Runtime Polymorphism)

        A aRefBObj = new B();
        A aRefCObj = new C();
        B bRefCObj = new C();

        // reference is A type → A's role is printed (NOT B's or C's)
        System.out.println("A ref → B obj → role : " + aRefBObj.role); // A's role
        System.out.println("A ref → C obj → role : " + aRefCObj.role); // A's role
        System.out.println("B ref → C obj → role : " + bRefCObj.role); // B's role

        System.out.println("\n--- Side by Side Comparison ---");
        System.out.println("            METHOD          |    DATA MEMBER");
        System.out.println("---------------------------------------------");

        A polyRef1 = new B();
        System.out.println("A ref→B obj | display() : B's version  | role : " + polyRef1.role);
        polyRef1.display();

        A polyRef2 = new C();
        System.out.println("A ref→C obj | display() : C's version  | role : " + polyRef2.role);
        polyRef2.display();

        System.out.println("\n--- KEY DIFFERENCE SUMMARY ---");
        System.out.println("Methods  → Runtime Polymorphism  → Object type wins");
        System.out.println("Variables → No Runtime Polymorphism → Reference type wins");
    }
}