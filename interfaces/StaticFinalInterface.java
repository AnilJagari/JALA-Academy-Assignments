package jala.interfaces;

/**
 * Assignment-10: Interfaces
 * Task 11: Interface with static final variables
 * Demonstrates constants in interfaces used across classes
 * Author: Anil Jagari
 */
public interface StaticFinalInterface {

    // =====================================================
    // Static Final Variables → Constants
    // Can be accessed without creating any object
    // Access as: StaticFinalInterface.PI
    // =====================================================
    static final double PI          = 3.14159;
    static final int    MAX_SIZE    = 100;
    static final String APP_NAME    = "JALA App";
    static final String VERSION     = "1.0.0";
    static final int    TIMEOUT     = 30;

    // Abstract method
    void showConstants();
}