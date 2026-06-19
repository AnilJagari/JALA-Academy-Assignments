package jala.abstracts;

/**
 * Assignment-9: Abstract Class
 * Child Class - Cat extends Animal
 *
 * 1. Implements all abstract methods from Animal
 * 2. Creates object of Animal type → calls non-abstract methods
 * 3. Creates instance of Cat → calls abstract methods (implemented)
 * 4. Creates instance of Cat → calls non-abstract methods
 * Author: Anil Jagari
 */
public class Cat extends Animal {

    // =====================================================
    // Cat's own instance variables
    // =====================================================
    String furColor = "White";
    String breed    = "Persian";

    // =====================================================
    // Implementing ABSTRACT methods from Animal
    // Mandatory → Cat MUST implement all abstract methods
    // =====================================================

    @Override
    public void sound() {
        System.out.println("Cat → sound() : Meow Meow!");
    }

    @Override
    public void move() {
        System.out.println("Cat → move()  : Cat walks and jumps silently");
    }

    @Override
    public void eat() {
        System.out.println("Cat → eat()   : Cat eats fish and cat food");
    }

    // =====================================================
    // Cat's own NON-ABSTRACT methods
    // =====================================================
    public void purr() {
        System.out.println("Cat → purr()  : Cat purrs when happy");
    }

    public void showCatInfo() {
        System.out.println("Cat → showCatInfo()");
        System.out.println("  Name     : " + name);       // inherited from Animal
        System.out.println("  Type     : " + type);       // inherited from Animal
        System.out.println("  Legs     : " + legs);       // inherited from Animal
        System.out.println("  Fur Color: " + furColor);   // Cat's own
        System.out.println("  Breed    : " + breed);      // Cat's own
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        // =================================================
        // PART 1: Abstract class object → NOT possible
        // Animal cannot be instantiated directly
        // =================================================
        System.out.println("================================================");
        System.out.println("  PART 1: Abstract Class - Cannot Instantiate   ");
        System.out.println("================================================");

        // COMPILE ERROR if uncommented:
        // Animal animal = new Animal();   // ERROR: Animal is abstract

        System.out.println("new Animal() → COMPILE ERROR");
        System.out.println("Abstract class cannot be instantiated directly.");

        // =================================================
        // PART 2: Animal reference → Cat object
        //         Access NON-ABSTRACT methods of Animal
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  PART 2: Animal Reference → Cat Object          ");
        System.out.println("         Calling Non-Abstract Methods             ");
        System.out.println("================================================");

        // Animal reference pointing to Cat object
        // Can only call Animal's methods from this reference
        Animal animalRef = new Cat();

        System.out.println("\n--- Non-Abstract Methods via Animal Reference ---");
        animalRef.breathe();     // ✓ non-abstract → Animal's version
        animalRef.sleep();       // ✓ non-abstract → Animal's version
        animalRef.showInfo();    // ✓ non-abstract → Animal's version

        System.out.println("\n--- Abstract Methods via Animal Reference ---");
        System.out.println("(Runtime Polymorphism → Cat's implementations run)");
        animalRef.sound();       // ✓ Cat's sound() runs → Runtime Polymorphism
        animalRef.move();        // ✓ Cat's move()  runs → Runtime Polymorphism
        animalRef.eat();         // ✓ Cat's eat()   runs → Runtime Polymorphism

        // Cannot access Cat specific methods via Animal reference
        // COMPILE ERROR if uncommented:
        // animalRef.purr();           // ERROR: Animal ref can't see Cat's methods
        // animalRef.showCatInfo();    // ERROR: Animal ref can't see Cat's methods

        // =================================================
        // PART 3: Cat instance → call ABSTRACT methods
        //         (implemented versions in Cat)
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  PART 3: Cat Instance → Calling Abstract Methods ");
        System.out.println("         (Implemented versions in Cat)             ");
        System.out.println("================================================");

        Cat catObj = new Cat();
        catObj.name     = "Whiskers";
        catObj.furColor = "Orange";
        catObj.breed    = "Tabby";

        System.out.println("\n--- Calling Implemented Abstract Methods ---");
        catObj.sound();     // Cat's implementation of abstract sound()
        catObj.move();      // Cat's implementation of abstract move()
        catObj.eat();       // Cat's implementation of abstract eat()

        // =================================================
        // PART 4: Cat instance → call NON-ABSTRACT methods
        //         (inherited from Animal + Cat's own)
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  PART 4: Cat Instance → Calling Non-Abstract    ");
        System.out.println("         Methods (Inherited + Cat's own)          ");
        System.out.println("================================================");

        System.out.println("\n--- Non-Abstract Methods Inherited from Animal ---");
        catObj.breathe();       // inherited non-abstract from Animal
        catObj.sleep();         // inherited non-abstract from Animal
        catObj.showInfo();      // inherited non-abstract from Animal

        System.out.println("\n--- Cat's Own Non-Abstract Methods ---");
        catObj.purr();          // Cat's own method
        catObj.showCatInfo();   // Cat's own method

        // =================================================
        // SUMMARY
        // =================================================
        System.out.println("\n================================================");
        System.out.println("  SUMMARY                                        ");
        System.out.println("================================================");
        System.out.println("Abstract class  → Cannot create object directly");
        System.out.println("Abstract method → No body, child MUST implement");
        System.out.println("Non-abstract    → Has body, child inherits directly");
        System.out.println("Animal ref→Cat  → Can call Animal methods only");
        System.out.println("Cat instance    → Can call ALL methods (Animal+Cat)");
        System.out.println("Runtime Poly    → Abstract method runs Cat's version");
    }
}