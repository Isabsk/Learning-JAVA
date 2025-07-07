import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        String password = "P@ssw0rd123";
        Scanner sc = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter your password: ");
            userInput = sc.nextLine();f
            System.out.println(userInput);
            if (userInput.equals(password)) {
                System.out.println("Access granted.");
                break;
            }
            else {
                System.out.println("Access denied. Try again.");
            }
        } while (true);
    }
}
