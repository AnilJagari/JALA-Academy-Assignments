package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * Sub class trying to access PRIVATE members of PrivateExample
 * Author: Anil Jagari
 */
public class PrivateChild extends PrivateExample {

    public void tryAccessingPrivate() {

        System.out.println("===== PrivateChild trying to access Private Members =====");

        // COMPILE ERROR if uncommented:
        // System.out.println(name);       // ERROR: name is private in PrivateExample
        // System.out.println(age);        // ERROR: age is private
        // System.out.println(salary);     // ERROR: salary is private
        // privateMethod();                // ERROR: privateMethod() is private

        // ✓ Can access via PUBLIC getter methods (Encapsulation)
        System.out.println("Access via getters only:");
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Salary : " + getSalary());

        System.out.println("\nConclusion: Private members are NOT accessible in subclass.");
        System.out.println("Use public getters/setters to access private fields.");
    }

    public static void main(String[] args) {
        PrivateChild child = new PrivateChild();
        child.tryAccessingPrivate();
    }
}