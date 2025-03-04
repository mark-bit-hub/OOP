import java.util.Scanner;

public class PalindromeChecker {
    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if palindrome: ");
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num) ? "Palindrome" : "Not Palindrome");
        scanner.close();
    }
}
