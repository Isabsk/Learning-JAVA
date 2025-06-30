class Operators {
    public static void main(String[] args) {
        // Operators in Java
        // Arithmetic operations
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operations:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Post-increment and Pre-increment
        int x = 5;
        System.out.println("\nPost and Pre Increment:");
        System.out.println("Original x: " + x);
        System.out.println("Post-increment x++: " + (x++)); // prints 5, then x becomes 6
        System.out.println("After post-increment x: " + x);
        System.out.println("Pre-increment ++x: " + (++x)); // x becomes 7, then prints 7

        // Logical operators with numeric conditions
        int num1 = 8;
        int num2 = 12;

        System.out.println("\nLogical Operators with Conditions:");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        // Logical AND
        System.out.println("(num1 > 5) && (num2 < 15): " + ((num1 > 5) && (num2 < 15))); // true && true = true
        System.out.println("(num1 < 5) && (num2 < 15): " + ((num1 < 5) && (num2 < 15))); // false && true = false

        // Logical OR
        System.out.println("(num1 > 5) || (num2 > 20): " + ((num1 > 5) || (num2 > 20))); // true || false = true
        System.out.println("(num1 < 5) || (num2 > 20): " + ((num1 < 5) || (num2 > 20))); // false || false = false

        // Logical NOT
        boolean isEven = (num1 % 2 == 0);
        System.out.println("num1 is even: " + isEven);
        System.out.println("NOT isEven (!isEven): " + (!isEven));
    }
}
