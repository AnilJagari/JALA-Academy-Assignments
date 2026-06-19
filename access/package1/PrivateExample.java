package jala.access.package1;

/**
 * Assignment-8: Access Modifiers
 * PRIVATE - only accessible within the same class
 * Author: Anil Jagari
 */
public class PrivateExample {

    // =====================================================
    // PRIVATE fields → only accessible inside this class
    // =====================================================
    private String name    = "Anil Jagari";
    private int    age     = 25;
    private double salary  = 50000.00;

    // =====================================================
    // PRIVATE method → only callable inside this class
    // =====================================================
    private void privateMethod() {
        System.out.println("Private Method called!");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }

    // =====================================================
    // PUBLIC getter methods → to access private fields
    // from outside (Encapsulation)
    // =====================================================
    public String getName()   { return name;   }
    public int    getAge()    { return age;     }
    public double getSalary() { return salary;  }

    // =====================================================
    // MAIN METHOD
    // Private fields and methods ARE accessible here
    // because main is inside the same class
    // =====================================================
    public static void main(String[] args) {

        PrivateExample obj = new PrivateExample();

        System.out.println("===== Accessing Private Fields in Main =====");
        // Direct access works → same class
        System.out.println("Name   : " + obj.name);
        System.out.println("Age    : " + obj.age);
        System.out.println("Salary : " + obj.salary);

        System.out.println("\n===== Calling Private Method in Main =====");
        // Direct call works → same class
        obj.privateMethod();
    }
}