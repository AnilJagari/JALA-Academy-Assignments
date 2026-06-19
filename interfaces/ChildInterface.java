package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 7: Interface inheriting from ParentInterface
 * An interface can extend another interface
 * Author: Anil Jagari
 */
public interface ChildInterface extends ParentInterface {

    // ChildInterface inherits all methods from ParentInterface:
    // → abstractMethod()
    // → defaultMethod()
    // → showInterfaceInfo()

    // ChildInterface adds its own method
    void childMethod();

    // ChildInterface can override parent's default method
    default void showInterfaceInfo() {
        System.out.println("ChildInterface → showInterfaceInfo() : I am Child Interface");
        System.out.println("ChildInterface extends ParentInterface");
    }
}