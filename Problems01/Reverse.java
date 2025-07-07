public class Reverse {
    public static void main(String[] args) {
        int n = 12345; // Example number
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            n = n / 10; // Remove the last digit from n            
        }
        System.out.println("Reversed Number: " + reversed); // Output the reversed number
    }
}
