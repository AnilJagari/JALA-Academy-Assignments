package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 2: Interface with TWO methods
 * One will be implemented, one will be left → class must be abstract
 * Author: Anil Jagari
 */
public interface PartialInterface {

    void methodOne();    // will be implemented
    void methodTwo();    // will NOT be implemented → class becomes abstract
}