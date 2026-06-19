package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 4: Second interface with one method
 * Task 5: Interface with same method signature as InterfaceA
 * Author: Anil Jagari
 */
public interface InterfaceB {

    // Task 4: unique method
    void methodFromB();

    // Task 5: same method signature as InterfaceA
    // Only ONE implementation needed in class → no conflict
    void commonMethod();
}