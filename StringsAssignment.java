/**
 * Assignment-6: Strings in Java
 * Topics: String creation, manipulation, comparison, conversion
 * Author: Anil Jagari
 */
public class StringsAssignment {

    // =====================================================
    // 1. Different ways of creating a String
    // =====================================================
    public void differentWaysOfCreatingString() {
        System.out.println("===== 1. Different Ways of Creating String =====");

        // Way 1: String literal → stored in String Pool
        String str1 = "Hello JALA Academy";

        // Way 2: Using new keyword → stored in Heap memory
        String str2 = new String("Hello JALA Academy");

        // Way 3: From char array
        char[] chars = {'J', 'A', 'L', 'A'};
        String str3 = new String(chars);

        // Way 4: Empty string
        String str4 = "";

        // Way 5: From another string
        String str5 = new String(str1);

        System.out.println("Way 1 - Literal       : " + str1);
        System.out.println("Way 2 - new String()  : " + str2);
        System.out.println("Way 3 - char array    : " + str3);
        System.out.println("Way 4 - Empty String  : '" + str4 + "'");
        System.out.println("Way 5 - From String   : " + str5);

        // == vs equals() difference
        System.out.println("\n--- == vs equals() ---");
        System.out.println("str1 == str2   : " + (str1 == str2));       // false → different memory
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); // true  → same content
    }

    // =====================================================
    // 2. Concatenating two strings using + operator
    // =====================================================
    public void concatenateStrings() {
        System.out.println("\n===== 2. String Concatenation =====");

        String firstName = "Anil";
        String lastName  = "Jagari";

        // Using + operator
        String fullName = firstName + " " + lastName;
        System.out.println("First Name  : " + firstName);
        System.out.println("Last Name   : " + lastName);
        System.out.println("Full Name   : " + fullName);

        // Concatenating with numbers
        String result = "Total Students : " + 500;
        System.out.println(result);

        // Using concat() method
        String concatResult = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat() : " + concatResult);
    }

    // =====================================================
    // 3. Finding the length of a string
    // =====================================================
    public void stringLength() {
        System.out.println("\n===== 3. String Length =====");

        String str = "Bright IT Career";
        System.out.println("String          : " + str);
        System.out.println("Length          : " + str.length());

        String empty = "";
        System.out.println("Empty String    : '" + empty + "'");
        System.out.println("Empty Length    : " + empty.length());

        // Length with spaces
        String withSpaces = "  JALA  ";
        System.out.println("With Spaces     : '" + withSpaces + "'");
        System.out.println("Length          : " + withSpaces.length());
    }

    // =====================================================
    // 4. Extract a string using substring()
    // =====================================================
    public void substringDemo() {
        System.out.println("\n===== 4. Substring =====");

        String str = "Bright IT Career";
        System.out.println("Original String         : " + str);

        // substring(startIndex) → from index to end
        String sub1 = str.substring(7);
        System.out.println("substring(7)            : " + sub1);

        // substring(startIndex, endIndex) → startIndex inclusive, endIndex exclusive
        String sub2 = str.substring(0, 6);
        System.out.println("substring(0, 6)         : " + sub2);

        String sub3 = str.substring(10, 16);
        System.out.println("substring(10, 16)       : " + sub3);

        // Extract first word
        String firstWord = str.substring(0, str.indexOf(" "));
        System.out.println("First Word              : " + firstWord);
    }

    // =====================================================
    // 5. Searching in strings using indexOf()
    // =====================================================
    public void indexOfDemo() {
        System.out.println("\n===== 5. indexOf() =====");

        String str = "Bright IT Career at JALA Academy";
        System.out.println("String                        : " + str);

        // indexOf(char) → first occurrence
        System.out.println("indexOf('a')                  : " + str.indexOf('a'));

        // indexOf(String) → first occurrence of substring
        System.out.println("indexOf(\"Career\")             : " + str.indexOf("Career"));

        // indexOf(String, fromIndex) → search from specific index
        System.out.println("indexOf('a', 10)              : " + str.indexOf('a', 10));

        // lastIndexOf → last occurrence
        System.out.println("lastIndexOf('a')              : " + str.lastIndexOf('a'));

        // Not found returns -1
        System.out.println("indexOf(\"Python\")             : " + str.indexOf("Python"));

        // Check if string contains a word
        boolean contains = str.indexOf("JALA") != -1;
        System.out.println("Contains 'JALA'               : " + contains);
    }

    // =====================================================
    // 6. Matching string with Regular Expression matches()
    // =====================================================
    public void regexMatchesDemo() {
        System.out.println("\n===== 6. Regular Expression matches() =====");

        // Check if string contains only digits
        String number = "12345";
        System.out.println("'12345' is all digits     : " + number.matches("[0-9]+"));

        // Check if string contains only letters
        String name = "AnilJagari";
        System.out.println("'AnilJagari' all letters  : " + name.matches("[a-zA-Z]+"));

        // Check valid email format
        String email = "anil@gmail.com";
        System.out.println("Valid email format         : " + email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));

        // Check if string is alphanumeric
        String alphanumeric = "Anil123";
        System.out.println("'Anil123' alphanumeric    : " + alphanumeric.matches("[a-zA-Z0-9]+"));

        // Check phone number (10 digits)
        String phone = "9876543210";
        System.out.println("Valid phone (10 digits)    : " + phone.matches("[0-9]{10}"));
    }

    // =====================================================
    // 7 & 8. Comparing strings
    //         equals(), equalsIgnoreCase(),
    //         startsWith(), endsWith(), compareTo()
    // =====================================================
    public void comparingStrings() {
        System.out.println("\n===== 7 & 8. Comparing Strings =====");

        String str1 = "JALA Academy";
        String str2 = "jala academy";
        String str3 = "JALA Academy";

        // equals() → case sensitive
        System.out.println("--- equals() ---");
        System.out.println("str1.equals(str2)           : " + str1.equals(str2));  // false
        System.out.println("str1.equals(str3)           : " + str1.equals(str3));  // true

        // equalsIgnoreCase() → ignores case
        System.out.println("\n--- equalsIgnoreCase() ---");
        System.out.println("str1.equalsIgnoreCase(str2) : " + str1.equalsIgnoreCase(str2)); // true

        // startsWith()
        System.out.println("\n--- startsWith() ---");
        System.out.println("str1.startsWith(\"JALA\")     : " + str1.startsWith("JALA"));   // true
        System.out.println("str1.startsWith(\"Academy\")  : " + str1.startsWith("Academy")); // false

        // endsWith()
        System.out.println("\n--- endsWith() ---");
        System.out.println("str1.endsWith(\"Academy\")    : " + str1.endsWith("Academy"));  // true
        System.out.println("str1.endsWith(\"JALA\")       : " + str1.endsWith("JALA"));     // false

        // compareTo() → lexicographic comparison
        // returns 0 if equal, negative if less, positive if greater
        System.out.println("\n--- compareTo() ---");
        System.out.println("str1.compareTo(str3)        : " + str1.compareTo(str3));  //  0 → equal
        System.out.println("str1.compareTo(str2)        : " + str1.compareTo(str2));  // negative → str1 < str2
        System.out.println("str2.compareTo(str1)        : " + str2.compareTo(str1));  // positive → str2 > str1
    }

    // =====================================================
    // 9. Trimming strings with trim()
    // =====================================================
    public void trimDemo() {
        System.out.println("\n===== 9. Trim =====");

        String str = "   Bright IT Career   ";
        System.out.println("Before trim : '" + str + "'");
        System.out.println("Length before : " + str.length());

        String trimmed = str.trim();
        System.out.println("After  trim : '" + trimmed + "'");
        System.out.println("Length after  : " + trimmed.length());

        // Practical use → user input cleanup
        String userInput = "   anil@gmail.com   ";
        System.out.println("\nUser email before trim : '" + userInput + "'");
        System.out.println("User email after  trim : '" + userInput.trim() + "'");
    }

    // =====================================================
    // 10. Replacing characters with replace()
    // =====================================================
    public void replaceDemo() {
        System.out.println("\n===== 10. Replace =====");

        String str = "Bright IT Career";
        System.out.println("Original : " + str);

        // replace single character
        System.out.println("replace('i','*')         : " + str.replace('i', '*'));

        // replace substring
        System.out.println("replace(\"IT\",\"Software\") : " + str.replace("IT", "Software"));

        // replaceAll with regex → replace all spaces with underscore
        System.out.println("replaceAll spaces        : " + str.replaceAll(" ", "_"));

        // replaceFirst → only first occurrence
        String repeated = "Java Java Java";
        System.out.println("replaceFirst             : " + repeated.replaceFirst("Java", "Python"));
    }

    // =====================================================
    // 11. Splitting strings with split()
    // =====================================================
    public void splitDemo() {
        System.out.println("\n===== 11. Split =====");

        // Split by space
        String sentence = "Bright IT Career JALA Academy";
        System.out.println("Original : " + sentence);
        String[] words = sentence.split(" ");
        System.out.println("Split by space :");
        for (int i = 0; i < words.length; i++) {
            System.out.println("  [" + i + "] " + words[i]);
        }

        // Split by comma
        String csv = "Anil,Ravi,Kumar,Sita,Gita";
        System.out.println("\nCSV      : " + csv);
        String[] names = csv.split(",");
        System.out.println("Split by comma :");
        for (int i = 0; i < names.length; i++) {
            System.out.println("  [" + i + "] " + names[i]);
        }

        // Split with limit
        String data = "one:two:three:four";
        System.out.println("\nSplit with limit 2 :");
        String[] limited = data.split(":", 2);
        for (int i = 0; i < limited.length; i++) {
            System.out.println("  [" + i + "] " + limited[i]);
        }
    }

    // =====================================================
    // 12. Converting Numbers to Strings with valueOf()
    // =====================================================
    public void valueOfDemo() {
        System.out.println("\n===== 12. valueOf() - Number to String =====");

        int    intVal    = 100;
        double doubleVal = 99.99;
        float  floatVal  = 12.5f;
        boolean boolVal  = true;
        char   charVal   = 'A';

        String fromInt     = String.valueOf(intVal);
        String fromDouble  = String.valueOf(doubleVal);
        String fromFloat   = String.valueOf(floatVal);
        String fromBoolean = String.valueOf(boolVal);
        String fromChar    = String.valueOf(charVal);

        System.out.println("int     to String : '" + fromInt     + "'  length: " + fromInt.length());
        System.out.println("double  to String : '" + fromDouble  + "'  length: " + fromDouble.length());
        System.out.println("float   to String : '" + fromFloat   + "'  length: " + fromFloat.length());
        System.out.println("boolean to String : '" + fromBoolean + "'  length: " + fromBoolean.length());
        System.out.println("char    to String : '" + fromChar    + "'  length: " + fromChar.length());
    }

    // =====================================================
    // 13. Converting Integer objects to Strings
    // =====================================================
    public void integerToStringDemo() {
        System.out.println("\n===== 13. Integer Object to String =====");

        Integer intObj = 250;

        // Way 1: toString() on Integer object
        String str1 = intObj.toString();
        System.out.println("Way 1 - toString()         : " + str1);

        // Way 2: String.valueOf()
        String str2 = String.valueOf(intObj);
        System.out.println("Way 2 - String.valueOf()   : " + str2);

        // Way 3: Concatenation with empty string
        String str3 = intObj + "";
        System.out.println("Way 3 - concat empty ''    : " + str3);

        // Way 4: Integer.toString(int)
        String str4 = Integer.toString(intObj);
        System.out.println("Way 4 - Integer.toString() : " + str4);

        // Verify all are Strings by checking length()
        System.out.println("Length of str1             : " + str1.length());
    }

    // =====================================================
    // 14. Converting to Uppercase and Lowercase
    // =====================================================
    public void upperLowerCaseDemo() {
        System.out.println("\n===== 14. Uppercase and Lowercase =====");

        String str = "Bright IT Career - JALA Academy";
        System.out.println("Original   : " + str);
        System.out.println("Uppercase  : " + str.toUpperCase());
        System.out.println("Lowercase  : " + str.toLowerCase());

        // Practical use → case-insensitive comparison
        String input    = "JAVA";
        String expected = "java";
        System.out.println("\nCase-insensitive comparison :");
        System.out.println("input.toLowerCase().equals(expected) : "
                + input.toLowerCase().equals(expected));

        // Capitalize first letter manually
        String word = "jalaacademy";
        String capitalized = word.substring(0, 1).toUpperCase()
                           + word.substring(1).toLowerCase();
        System.out.println("\nCapitalized : " + capitalized);
    }

    // =====================================================
    // MAIN METHOD
    // =====================================================
    public static void main(String[] args) {

        StringsAssignment obj = new StringsAssignment();

        obj.differentWaysOfCreatingString();  // 1
        obj.concatenateStrings();              // 2
        obj.stringLength();                    // 3
        obj.substringDemo();                   // 4
        obj.indexOfDemo();                     // 5
        obj.regexMatchesDemo();                // 6
        obj.comparingStrings();                // 7 & 8
        obj.trimDemo();                        // 9
        obj.replaceDemo();                     // 10
        obj.splitDemo();                       // 11
        obj.valueOfDemo();                     // 12
        obj.integerToStringDemo();             // 13
        obj.upperLowerCaseDemo();              // 14
    }
}