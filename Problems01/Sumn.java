// Sum of First N Natural Numbers
// 📝 Input a number N and print the sum: 1 + 2 + 3 + … + N

import java.util.Scanner;

public class Sumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
