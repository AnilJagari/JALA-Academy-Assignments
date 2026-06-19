package jala.abstracts;

/**
 * Assignment-9: Abstract Class
 * Abstract Class - Animal
 * Contains abstract and non-abstract methods
 * Author: Anil Jagari
 */
public abstract class Animal {

    // =====================================================
    // Instance Variables
    // =====================================================
    String name   = "Animal";
    String type   = "Mammal";
    int    legs   = 4;

    // =====================================================
    // ABSTRACT Methods
    // → No body here, MUST be implemented by child class
    // → Every animal makes different sound → abstract
    // → Every animal moves differently   → abstract
    // =====================================================
    public abstract void sound();
    public abstract void move();
    public abstract void eat();

    // =====================================================
    // NON-ABSTRACT Methods
    // → Has body, can be used directly by child class
    // → Common behavior for all animals
    // =====================================================
    public void breathe() {
        System.out.println("Animal → breathe() : All animals breathe oxygen");
    }

    public void sleep() {
        System.out.println("Animal → sleep()   : All animals need sleep");
    }

    public void showInfo() {
        System.out.println("Animal → showInfo()");
        System.out.println("  Name  : " + name);
        System.out.println("  Type  : " + type);
        System.out.println("  Legs  : " + legs);
    }
}