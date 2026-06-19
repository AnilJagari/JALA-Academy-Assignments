package jala.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Assignment-14: Exceptions in Java
 * Author: Anil Jagari
 */
public class ExceptionsAssignment {

    // =====================================================
    // Task 1: Arithmetic Exception WITHOUT handling
    //         Commented out → would crash program if run
    // =====================================================
    public void arithmeticWithoutHandling() {
        System.out.println("===== Task 1: ArithmeticException - No Handling =====");
        System.out.println("Code: int result = 10 / 0;");
        System.out.println("This throws: java.lang.ArithmeticException: / by zero");
        System.out.println("Program CRASHES without try-catch");

        // Uncomment to see crash:
        // int result = 10 / 0;  // → ArithmeticException: / by zero
        // System.out.println(result);
    }

    // =====================================================
    // Task 2: Handle Arithmetic Exception using try-catch
    // =====================================================
    public void arithmeticWithHandling() {
        System.out.println("\n===== Task 2: ArithmeticException - With try-catch =====");
        try {
            int a      = 10;
            int b      = 0;
            int result = a / b;              // throws ArithmeticException
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
            System.out.println("Message : " + e.getMessage());
            System.out.println("Program continues after catch block");
        }
    }

    // =====================================================
    // Task 3: Method that throws exception
    //         Called WITHOUT try block → declared with throws
    // =====================================================
    public void methodThatThrows() throws Exception {
        System.out.println("methodThatThrows() → throwing exception now");
        throw new Exception("Exception thrown from methodThatThrows()");
    }

    public void callMethodWithoutTryBlock() throws Exception {
        System.out.println("\n===== Task 3: Method Throws - No try block =====");
        System.out.println("Calling methodThatThrows() without try block");
        System.out.println("Method declared with 'throws Exception'");
        System.out.println("Caller must handle OR declare throws too");
        methodThatThrows();   // no try block → exception propagates up
    }

    // =====================================================
    // Task 4: Multiple catch blocks
    // =====================================================
    public void multipleCatchBlocks(int choice) {
        System.out.println("\n===== Task 4: Multiple Catch Blocks =====");
        System.out.println("Choice : " + choice);
        try {
            if (choice == 1) {
                int result = 10 / 0;                          // ArithmeticException
            } else if (choice == 2) {
                int[] arr = new int[3];
                arr[10] = 5;                                  // ArrayIndexOutOfBoundsException
            } else if (choice == 3) {
                String str = null;
                str.length();                                 // NullPointerException
            } else if (choice == 4) {
                int num = Integer.parseInt("JALA");           // NumberFormatException
            } else {
                throw new Exception("Custom general exception for choice: " + choice);
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught      : " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds caught    : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught     : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught    : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught        : " + e.getMessage());
        } finally {
            System.out.println("Finally block → always executes");
        }
    }

    // =====================================================
    // Task 5: Throw exception with own message
    // =====================================================
    public void throwWithOwnMessage(int age) throws Exception {
        System.out.println("\n===== Task 5: Throw Exception with Own Message =====");
        System.out.println("Validating age : " + age);
        if (age < 18) {
            throw new Exception("Age must be 18 or above! Provided age: " + age);
        }
        if (age > 100) {
            throw new IllegalArgumentException("Age cannot exceed 100! Provided: " + age);
        }
        System.out.println("Age is valid : " + age);
    }

    // =====================================================
    // Task 6: Custom Exception
    // =====================================================
    public void customExceptionDemo(double salary) throws CustomException {
        System.out.println("\n===== Task 6: Custom Exception =====");
        System.out.println("Validating salary : " + salary);
        if (salary < 0) {
            throw new CustomException("ERR-SAL-001", "Salary cannot be negative: " + salary);
        }
        if (salary > 10000000) {
            throw new CustomException("ERR-SAL-002", "Salary exceeds maximum limit: " + salary);
        }
        System.out.println("Salary is valid : " + salary);
    }

    // =====================================================
    // Task 7: Finally block
    // =====================================================
    public void finallyBlockDemo() {
        System.out.println("\n===== Task 7: Finally Block =====");

        // Case 1: No exception → finally still runs
        System.out.println("--- Case 1: No Exception ---");
        try {
            System.out.println("try block   : no exception here");
            int result = 10 / 2;
            System.out.println("Result      : " + result);
        } catch (ArithmeticException e) {
            System.out.println("catch block : " + e.getMessage());
        } finally {
            System.out.println("finally block : ALWAYS runs (no exception case)");
        }

        // Case 2: Exception occurs → finally still runs
        System.out.println("\n--- Case 2: With Exception ---");
        try {
            System.out.println("try block   : exception about to occur");
            int result = 10 / 0;            // ArithmeticException
            System.out.println("Result      : " + result);  // skipped
        } catch (ArithmeticException e) {
            System.out.println("catch block : " + e.getMessage());
        } finally {
            System.out.println("finally block : ALWAYS runs (exception case)");
        }

        // Case 3: try-finally (no catch) → finally runs before propagation
        System.out.println("\n--- Case 3: try-finally without catch ---");
        try {
            System.out.println("try block   : running");
        } finally {
            System.out.println("finally block : runs even without catch");
        }
    }

    // =====================================================
    // Task 8: ArithmeticException
    // =====================================================
    public void generateArithmeticException() {
        System.out.println("\n===== Task 8: ArithmeticException =====");
        try {
            int numerator   = 50;
            int denominator = 0;
            System.out.println("Dividing " + numerator + " by " + denominator);
            int result = numerator / denominator;
            System.out.println("Result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
            System.out.println("Cause   : Division by zero");
        }
    }

    // =====================================================
    // Task 9: ArrayIndexOutOfBoundsException
    // =====================================================
    public void generateArrayIndexOutOfBounds() {
        System.out.println("\n===== Task 9: ArrayIndexOutOfBoundsException =====");
        try {
            int[] arr = {10, 20, 30};
            System.out.println("Array size     : " + arr.length);
            System.out.println("Accessing index: 10");
            System.out.println("Value          : " + arr[10]);   // valid: 0,1,2 only
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
            System.out.println("Cause : Accessed index beyond array length");
        }
    }

    // =====================================================
    // Task 10: ClassNotFoundException
    // =====================================================
    public void generateClassNotFoundException() {
        System.out.println("\n===== Task 10: ClassNotFoundException =====");
        try {
            System.out.println("Loading class : com.jala.NonExistentClass");
            Class.forName("com.jala.NonExistentClass");  // class doesn't exist
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException : " + e.getMessage());
            System.out.println("Cause : Class not found in classpath");
        }
    }

    // =====================================================
    // Task 11: FileNotFoundException
    // =====================================================
    public void generateFileNotFoundException() {
        System.out.println("\n===== Task 11: FileNotFoundException =====");
        try {
            System.out.println("Opening file : C:/nonexistent/file.txt");
            FileReader reader = new FileReader(new File("C:/nonexistent/file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException : " + e.getMessage());
            System.out.println("Cause : File does not exist at given path");
        }
    }

    // =====================================================
    // Task 12: IOException
    // =====================================================
    public void generateIOException() {
        System.out.println("\n===== Task 12: IOException =====");
        try {
            System.out.println("Attempting to read non-existent file");
            FileReader reader = new FileReader("nonexistent.txt");
            reader.read();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException (subclass of IOException)");
            System.out.println("IOException caught  : " + e.getMessage());
            System.out.println("Cause : File not found → triggers IOException");
        } catch (IOException e) {
            System.out.println("IOException caught  : " + e.getMessage());
            System.out.println("Cause : Input/Output operation failed");
        }
    }

    // =====================================================
    // Task 13: NoSuchFieldException
    // =====================================================
    public void generateNoSuchFieldException() {
        System.out.println("\n===== Task 13: NoSuchFieldException =====");
        try {
            System.out.println("Accessing field 'nonExistentField' via reflection");
            Class<?> cls = String.class;
            Field field  = cls.getField("nonExistentField");  // field doesn't exist
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException : " + e.getMessage());
            System.out.println("Cause : Field does not exist in the class");
        }
    }

    // =====================================================
    // Task 14: NoSuchMethodException
    // =====================================================
    public void generateNoSuchMethodException() {
        System.out.println("\n===== Task 14: NoSuchMethodException =====");
        try {
            System.out.println("Accessing method 'nonExistentMethod' via reflection");
            Class<?> cls = String.class;
            Method method = cls.getMethod("nonExistentMethod");  // method doesn't exist
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException : " + e.getMessage());
            System.out.println("Cause : Method does not exist in the class");
        }
    }

    // =====================================================
    // Task 15: NullPointerException
    // =====================================================
    public void generateNullPointerException() {
        System.out.println("\n===== Task 15: NullPointerException =====");
        try {
            String str = null;
            System.out.println("String is null, calling str.length()");
            int length = str.length();   // NullPointerException
            System.out.println("Length : " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            System.out.println("Cause : Called method on null reference");
        }
    }

    // =====================================================
    // Task 16: NumberFormatException
    // =====================================================
    public void generateNumberFormatException() {
        System.out.println("\n===== Task 16: NumberFormatException =====");
        try {
            String str = "JALA123";
            System.out.println("Parsing string to int : '" + str + "'");
            int num = Integer.parseInt(str);   // NumberFormatException
            System.out.println("Parsed value : " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException : " + e.getMessage());
            System.out.println("Cause : String cannot be converted to number");
        }
    }

    // =====================================================
    // Task 17: StringIndexOutOfBoundsException
    // =====================================================
    public void generateStringIndexOutOfBounds() {
        System.out.println("\n===== Task 17: StringIndexOutOfBoundsException =====");
        try {
            String str = "JALA";
            System.out.println("String         : " + str);
            System.out.println("String length  : " + str.length());
            System.out.println("Accessing index: 50");
            char ch = str.charAt(50);   // valid: 0-3 only
            System.out.println("Char           : " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException : " + e.getMessage());
            System.out.println("Cause : Accessed index beyond string length");
        }
    }

    // =====================================================
    // Task 18: SQLException
    // =====================================================
    public void generateSQLException() {
        System.out.println("\n===== Task 18: SQLException =====");
        try {
            System.out.println("Connecting to invalid database URL");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/nonexistentdb",
                    "root",
                    "wrongpassword"
            );
        } catch (SQLException e) {
            System.out.println("SQLException caught");
            System.out.println("Message    : " + e.getMessage());
            System.out.println("Error Code : " + e.getErrorCode());
            System.out.println("SQL State  : " + e.getSQLState());
            System.out.println("Cause      : Invalid DB URL / credentials / driver");
        }
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        ExceptionsAssignment obj = new ExceptionsAssignment();

        // Task 1
        obj.arithmeticWithoutHandling();

        // Task 2
        obj.arithmeticWithHandling();

        // Task 3
        System.out.println("\n===== Task 3: Method Throws Without try =====");
        try {
            obj.callMethodWithoutTryBlock();
        } catch (Exception e) {
            System.out.println("Caught in main : " + e.getMessage());
        }

        // Task 4
        obj.multipleCatchBlocks(1);   // ArithmeticException
        obj.multipleCatchBlocks(2);   // ArrayIndexOutOfBounds
        obj.multipleCatchBlocks(3);   // NullPointerException
        obj.multipleCatchBlocks(4);   // NumberFormatException
        obj.multipleCatchBlocks(5);   // General Exception

        // Task 5
        System.out.println("\n===== Task 5: Own Message Exception =====");
        try {
            obj.throwWithOwnMessage(15);    // invalid → < 18
        } catch (Exception e) {
            System.out.println("Caught : " + e.getMessage());
        }
        try {
            obj.throwWithOwnMessage(25);    // valid
        } catch (Exception e) {
            System.out.println("Caught : " + e.getMessage());
        }

        // Task 6
        try {
            obj.customExceptionDemo(-5000);    // invalid → negative
        } catch (CustomException e) {
            System.out.println("CustomException caught!");
            e.showErrorDetails();
        }
        try {
            obj.customExceptionDemo(50000);    // valid
        } catch (CustomException e) {
            System.out.println("CustomException caught!");
            e.showErrorDetails();
        }

        // Task 7
        obj.finallyBlockDemo();

        // Tasks 8-18: Generate all exceptions
        obj.generateArithmeticException();
        obj.generateArrayIndexOutOfBounds();
        obj.generateClassNotFoundException();
        obj.generateFileNotFoundException();
        obj.generateIOException();
        obj.generateNoSuchFieldException();
        obj.generateNoSuchMethodException();
        obj.generateNullPointerException();
        obj.generateNumberFormatException();
        obj.generateStringIndexOutOfBounds();
        obj.generateSQLException();

        // Summary
        System.out.println("\n================================================");
        System.out.println("  SUMMARY                                        ");
        System.out.println("================================================");
        System.out.println("Checked Exceptions   → must handle or declare throws");
        System.out.println("  FileNotFoundException, IOException, SQLException");
        System.out.println("  ClassNotFoundException, NoSuchFieldException");
        System.out.println("  NoSuchMethodException, CustomException");
        System.out.println("Unchecked Exceptions → runtime, no forced handling");
        System.out.println("  ArithmeticException, NullPointerException");
        System.out.println("  ArrayIndexOutOfBoundsException");
        System.out.println("  NumberFormatException");
        System.out.println("  StringIndexOutOfBoundsException");
        System.out.println("finally              → ALWAYS executes");
        System.out.println("throw                → manually throw exception");
        System.out.println("throws               → declare in method signature");
        System.out.println("Custom Exception     → extend Exception class");
    }
}