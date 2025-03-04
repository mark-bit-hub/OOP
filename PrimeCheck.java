import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number to check if prime: ");
        int num = s1.nextInt();

        boolean isPrime = true; // Assume the number is prime initially

        if (num <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break; // Exit the loop early
                }
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
        s1.close();
    }
}
