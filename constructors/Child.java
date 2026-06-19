package jala.constructors;

/**
 * Assignment-12: Constructors
 * Task 2: Calling Parent constructors from Child using super()
 * Author: Anil Jagari
 */
public class Child extends Parent {

    // =====================================================
    // Child Instance Variables
    // =====================================================
    String studentName;
    String course;
    int    duration;

    // =====================================================
    // Child Default Constructor
    // → calls Parent's default constructor via super()
    // =====================================================
    public Child() {
        super();   // → Parent's default constructor
        studentName = "Default Student";
        course      = "Java";
        duration    = 3;
        System.out.println("Child → Default Constructor called");
        System.out.println("  studentName : " + studentName);
        System.out.println("  course      : " + course);
        System.out.println("  duration    : " + duration);
    }

    // =====================================================
    // Child One-Arg Constructor
    // → calls Parent's one-arg constructor via super()
    // =====================================================
    public Child(String studentName) {
        super("JALA Academy");  // → Parent's one-arg constructor
        this.studentName = studentName;
        this.course      = "Java";
        this.duration    = 3;
        System.out.println("Child → One-Arg Constructor called");
        System.out.println("  studentName : " + this.studentName);
        System.out.println("  course      : " + this.course);
    }

    // =====================================================
    // Child Two-Arg Constructor
    // → calls Parent's two-arg constructor via super()
    // =====================================================
    public Child(String studentName, String course) {
        super("JALA Academy", "Hyderabad");  // → Parent's two-arg constructor
        this.studentName = studentName;
        this.course      = course;
        this.duration    = 3;
        System.out.println("Child → Two-Arg Constructor called");
        System.out.println("  studentName : " + this.studentName);
        System.out.println("  course      : " + this.course);
    }

    // =====================================================
    // Child Three-Arg Constructor
    // → calls Parent's three-arg constructor via super()
    // =====================================================
    public Child(String studentName, String course, int duration) {
        super("JALA Academy", "Hyderabad", 5);  // → Parent's three-arg constructor
        this.studentName = studentName;
        this.course      = course;
        this.duration    = duration;
        System.out.println("Child → Three-Arg Constructor called");
        System.out.println("  studentName : " + this.studentName);
        System.out.println("  course      : " + this.course);
        System.out.println("  duration    : " + this.duration);
    }

    // =====================================================
    // Child method
    // =====================================================
    public void showChildInfo() {
        System.out.println("Child → showChildInfo()");
        System.out.println("  studentName : " + studentName);
        System.out.println("  course      : " + course);
        System.out.println("  duration    : " + duration);
        System.out.println("  companyName : " + companyName);   // from Parent
        System.out.println("  location    : " + location);      // from Parent
    }
}