package jala.basics;

/**
 * Assignment-1: Java Basics
 * Topics: Class, Object, Methods, Comments, DataTypes, Variables
 * Author: Anil Jagari
 */
public class JavaBasicsAssignment {

    // Global Variable
    String name = "Anil Jagari - Global";

    // Method signature: public void printName()
    public void printName() {
        System.out.println("My Name is Anil Jagari");
    }

    // Local vs Global variable demo
    public void variableScopeDemo() {
        String name = "Anil Jagari - Local";  // local variable

        System.out.println("Local  : " + name);
        System.out.println("Global : " + this.name);  // 'this' accesses global
    }

    public static void main(String[] args) {

        // Creating object of the class
        JavaBasicsAssignment obj = new JavaBasicsAssignment();

        // 1. Class, Object, Method
        System.out.println("===== Class, Object and Method =====");
        obj.printName();

        // 2. Print Name
        System.out.println("\n===== Print Name =====");
        System.out.println("My Name is Anil Jagari");

        // 3. Comments
        System.out.println("\n===== Comments =====");
        // Single-line comment

        /*
         * Multi-line comment
         * Covers multiple lines
         */

        /**
         * JavaDoc comment
         * Used for API documentation
         */
        System.out.println("Comments demonstrated above in code.");

        // 4. Data Types
        System.out.println("\n===== Data Types =====");
        int intVal = 100;
        boolean boolVal = true;
        char charVal = 'A';
        float floatVal = 12.5f;
        double doubleVal = 99.99;

        System.out.println("int     : " + intVal);
        System.out.println("boolean : " + boolVal);
        System.out.println("char    : " + charVal);
        System.out.println("float   : " + floatVal);
        System.out.println("double  : " + doubleVal);

        // 5. Local vs Global Variables
        System.out.println("\n===== Local vs Global Variables =====");
        obj.variableScopeDemo();

        // 6. Function call from main
        System.out.println("\n===== Method Call =====");
        obj.printName();
    }
}