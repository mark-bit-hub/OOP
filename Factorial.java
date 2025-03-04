import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = s1.nextInt();
        
        int result = 1; // Initialize result to 1
        for (int i = 1; i <= num; i++) {
            result *= i; // Multiply result by i in each iteration
        }
        
        System.out.println("Factorial: " + result);
        s1.close();
    }
}
