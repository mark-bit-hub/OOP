import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci: ");
        int terms = s1.nextInt();

        int a = 0, b = 1; // Initialize first two Fibonacci numbers
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " "); // Print the current Fibonacci number
            int temp = a; // Store the value of 'a' in a temporary variable
            a = b; // Update 'a' to the next Fibonacci number
            b = temp + b; // Update 'b' to the sum of the previous two numbers
        }

        s1.close();
    }
}
