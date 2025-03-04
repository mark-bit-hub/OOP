import java.util.Scanner;

public class GCDCalculator {
    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers to find GCD: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("GCD: " + gcd(num1, num2));
        scanner.close();
    }
}
