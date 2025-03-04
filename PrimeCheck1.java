import java.util.Scanner;

public class PrimeCheck {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if prime: ");
        int num = scanner.nextInt();
        System.out.println(isPrime(num) ? "Prime" : "Not Prime");
        scanner.close();
    }
}
