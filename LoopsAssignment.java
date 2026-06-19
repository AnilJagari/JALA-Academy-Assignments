/**
 * Assignment-3: Loops in Java
 * Topics: for, while, do-while, switch, if-else
 * Author: Anil Jagari
 */
public class LoopsAssignment {

    // =====================================================
    // 1. Print "Bright IT Career" 10 times using for loop
    // =====================================================
    public void printBrightITCareer() {
        System.out.println("===== 1. For Loop - Print 10 Times =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Bright IT Career");
        }
    }

    // =====================================================
    // 2. Print 1 to 20 using while loop
    // =====================================================
    public void printOneToTwenty() {
        System.out.println("\n===== 2. While Loop - 1 to 20 =====");
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // =====================================================
    // 3. Equal and Not Equal Operators with loop
    // =====================================================
    public void equalNotEqualDemo() {
        System.out.println("\n===== 3. Equal and Not Equal in Loop =====");
        int a = 10;
        int b = 20;

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i == 3 is TRUE  at i = " + i);
            } else {
                System.out.println("i != 3 is TRUE  at i = " + i);
            }
        }

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
    }

    // =====================================================
    // 4. Print Odd and Even numbers (1 to 20)
    // =====================================================
    public void oddAndEven() {
        System.out.println("\n===== 4. Odd and Even Numbers =====");
        System.out.print("Even : ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd  : ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // =====================================================
    // 5. Largest number among three numbers
    // =====================================================
    public void largestOfThree(int a, int b, int c) {
        System.out.println("\n===== 5. Largest Among Three Numbers =====");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        int largest;

        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest Number : " + largest);
    }

    // =====================================================
    // 6. Print even numbers between 10 and 100 using while
    // =====================================================
    public void evenBetweenTenAndHundred() {
        System.out.println("\n===== 6. Even Numbers Between 10 and 100 =====");
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    // =====================================================
    // 7. Print 1 to 10 using do-while loop
    // =====================================================
    public void doWhileOneToTen() {
        System.out.println("\n===== 7. Do-While Loop - 1 to 10 =====");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }

    // =====================================================
    // 8. Armstrong Number Check
    // Example: 153 = 1^3 + 5^3 + 3^3 = 153 ✓
    // =====================================================
    public void armstrongCheck(int number) {
        System.out.println("\n===== 8. Armstrong Number Check =====");
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();  // count digits

        int temp = number;
        while (temp != 0) {
            int remainder = temp % 10;       // get last digit
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * remainder;   // manual power (no Math.pow)
            }
            sum = sum + power;
            temp = temp / 10;               // remove last digit
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }

    // =====================================================
    // 9. Prime Number Check
    // Prime = divisible only by 1 and itself
    // =====================================================
    public void primeCheck(int number) {
        System.out.println("\n===== 9. Prime Number Check =====");
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }

    // =====================================================
    // 10. Palindrome Check
    // Example: 121 reversed = 121 ✓  |  "madam" reversed = "madam" ✓
    // =====================================================
    public void palindromeCheck(int number) {
        System.out.println("\n===== 10. Palindrome Check =====");
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number = number / 10;            // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }

    // =====================================================
    // 11. Even or Odd using Switch
    // =====================================================
    public void evenOddSwitch(int number) {
        System.out.println("\n===== 11. Even or Odd using Switch =====");
        System.out.println("Number : " + number);

        switch (number % 2) {
            case 0:
                System.out.println(number + " is EVEN");
                break;
            case 1:
            case -1:
                System.out.println(number + " is ODD");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    // =====================================================
    // 12. Gender using Switch (M / F)
    // =====================================================
    public void genderSwitch(char gender) {
        System.out.println("\n===== 12. Gender using Switch =====");
        System.out.println("Input : " + gender);

        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Gender : Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Gender : Female");
                break;
            default:
                System.out.println("Invalid gender input. Use M or F.");
        }
    }

    // =====================================================
    // 13. Largest number using multiple if-else (10, 20, 30)
    // =====================================================
    public void largestUsingIfElse() {
        System.out.println("\n===== 13. Largest Using Multiple If-Else =====");
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (a > b && a > c) {
            System.out.println("Largest : " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest : " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest : " + c);
        } else {
            System.out.println("All numbers are equal");
        }
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        LoopsAssignment obj = new LoopsAssignment();

        obj.printBrightITCareer();       // 1
        obj.printOneToTwenty();          // 2
        obj.equalNotEqualDemo();         // 3
        obj.oddAndEven();                // 4
        obj.largestOfThree(40, 80, 60); // 5
        obj.evenBetweenTenAndHundred();  // 6
        obj.doWhileOneToTen();           // 7
        obj.armstrongCheck(153);         // 8 → Armstrong ✓
        obj.armstrongCheck(100);         // 8 → Not Armstrong ✓
        obj.primeCheck(7);               // 9 → Prime ✓
        obj.primeCheck(10);              // 9 → Not Prime ✓
        obj.palindromeCheck(121);        // 10 → Palindrome ✓
        obj.palindromeCheck(123);        // 10 → Not Palindrome ✓
        obj.evenOddSwitch(14);           // 11 → Even
        obj.evenOddSwitch(7);            // 11 → Odd
        obj.genderSwitch('M');           // 12 → Male
        obj.genderSwitch('F');           // 12 → Female
        obj.largestUsingIfElse();        // 13
    }
}