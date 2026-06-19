package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 6: Interface with DEFAULT method
 * Task 7: Parent interface to be inherited by ChildInterface
 * Author: Anil Jagari
 */
public interface ParentInterface {

    // Regular abstract method
    void abstractMethod();

    // Task 6: DEFAULT method → has body
    // Implementing class does NOT need to override this
    // But CAN override if needed
    default void defaultMethod() {
        System.out.println("ParentInterface → defaultMethod() : Default implementation");
        System.out.println("This runs without any implementation in the class");
    }

    // Another default method
    default void showInterfaceInfo() {
        System.out.println("ParentInterface → showInterfaceInfo() : I am Parent Interface");
    }
}