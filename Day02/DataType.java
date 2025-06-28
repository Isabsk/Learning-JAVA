
class DataType {
    public static void main(String[] args) {
        // Data types in Java

        // Primitive data types
        System.out.println();
        int num1 = 2147483647; // int
        byte num2 = 127; // byte
        short num3 = 32767; // short
        long num4 = 9223372036854775807l; // long
        float num5 = 3.14f; // float
        double num6 = 3.141592653589793; // double
        char letter = 'A'; // char
        boolean isTrue = true; // boolean
        System.out.println("This is an integer: " + num1);
        System.out.println("This is a byte: " + num2);
        System.out.println("This is a short: " + num3);
        System.out.println("This is a long: " + num4);
        System.out.println("This is a float: " + num5);
        System.out.println("This is a double: " + num6);
        System.out.println("This is a character: " + letter);
        System.out.println("This is a boolean: " + isTrue);
        System.out.println();

        // Literals in Java

        int binary = 0b1010; // Binary literal
        int octal = 012; // Octal literal
        int hex = 0xA; // Hexadecimal literal
        int underScore = 1_000_000; // Underscore in numeric literals
        double exp = 34e2; // Exponential notation
        System.out.println("Binary literal: " + binary);
        System.out.println("Octal literal: " + octal);
        System.out.println("Hexadecimal literal: " + hex);
        System.out.println("Underscore in numeric literals: " + underScore);
        System.out.println("Exponential notation: " + exp);

        // Character literals and operations

        System.out.println();
        char c = 'A'; // Character literal
        System.out.println("Character before increment: " + c);
        c++; // Increment character
        System.out.println("Character after increment: " + c);
        
        // String literals

        System.out.println();
        String str1 = "Hello, World!"; // String literal
        String str2 = "Java Programming"; // Another string literal
        System.out.println("String literal 1: " + str1);
        System.out.println("String literal 2: " + str2);
        
        // Escape sequences in Java

        System.out.println();
        String escapeSeq = "This is a string with an escape sequence: \nNew line here.\tTab here.";
        System.out.println(escapeSeq);
        
        // String concatenation

        System.out.println();
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Concatenation using

    }
}
