/**
 * Assignment-2: Operators in Java
 * Topics: Arithmetic, Increment/Decrement, Equality,
 *         Logical, Relational Operators
 * Author: Anil Jagari
 */
public class OperatorsAssignment {

    // =====================================================
    // 1. Arithmetic Operators (+, -, *, /)
    // =====================================================
    public void arithmeticOperators(int a, int b) {
        System.out.println("===== Arithmetic Operators =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Modulus        : " + (a % b));
    }

    // =====================================================
    // 2. Increment and Decrement Operators (++, --)
    // =====================================================
    public void incrementDecrement(int a) {
        System.out.println("\n===== Increment and Decrement Operators =====");
        System.out.println("Original value : " + a);

        // Pre-increment → increments first, then uses value
        System.out.println("Pre-Increment  : " + (++a));

        // Post-increment → uses value first, then increments
        System.out.println("Post-Increment : " + (a++));
        System.out.println("After Post-Inc : " + a);

        // Pre-decrement
        System.out.println("Pre-Decrement  : " + (--a));

        // Post-decrement
        System.out.println("Post-Decrement : " + (a--));
        System.out.println("After Post-Dec : " + a);
    }

    // =====================================================
    // 3. Equal and Not Equal Operators (==, !=)
    // =====================================================
    public void equalAndNotEqual(int a, int b) {
        System.out.println("\n===== Equal and Not Equal Operators =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    // =====================================================
    // 4. Find Two Numbers Equal or Not
    // =====================================================
    public void areTwoNumbersEqual(int a, int b) {
        System.out.println("\n===== Are Two Numbers Equal? =====");
        System.out.println("a = " + a + ", b = " + b);

        if (a == b) {
            System.out.println("Both numbers are EQUAL");
        } else {
            System.out.println("Both numbers are NOT EQUAL");
        }
    }

    // =====================================================
    // 5. Logical AND, OR, NOT Operators
    // =====================================================
    public void logicalOperators(boolean x, boolean y) {
        System.out.println("\n===== Logical Operators =====");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Logical AND (x && y) : " + (x && y));
        System.out.println("Logical OR  (x || y) : " + (x || y));
        System.out.println("Logical NOT (!x)     : " + (!x));
        System.out.println("Logical NOT (!y)     : " + (!y));
    }

    // =====================================================
    // 6. Relational Operators (<, <=, >, >=)
    // =====================================================
    public void relationalOperators(int a, int b) {
        System.out.println("\n===== Relational Operators =====");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a <  b : " + (a <  b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >  b : " + (a >  b));
        System.out.println("a >= b : " + (a >= b));
    }

    // =====================================================
    // 7. Print Smaller and Larger Number
    // =====================================================
    public void smallerAndLarger(int a, int b) {
        System.out.println("\n===== Smaller and Larger Number =====");
        System.out.println("a = " + a + ", b = " + b);

        if (a < b) {
            System.out.println("Smaller Number : " + a);
            System.out.println("Larger  Number : " + b);
        } else if (b < a) {
            System.out.println("Smaller Number : " + b);
            System.out.println("Larger  Number : " + a);
        } else {
            System.out.println("Both numbers are EQUAL - no smaller or larger");
        }
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        OperatorsAssignment obj = new OperatorsAssignment();

        // 1. Arithmetic
        obj.arithmeticOperators(20, 5);

        // 2. Increment / Decrement
        obj.incrementDecrement(10);

        // 3. Equal and Not Equal
        obj.equalAndNotEqual(10, 20);

        // 4. Two numbers equal check
        obj.areTwoNumbersEqual(15, 15);

        // 5. Logical Operators
        obj.logicalOperators(true, false);

        // 6. Relational Operators
        obj.relationalOperators(10, 20);

        // 7. Smaller and Larger
        obj.smallerAndLarger(10, 20);
    }
}