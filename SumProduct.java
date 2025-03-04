import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter num1 and num2: ");
        num1 = s1.nextInt();
        num2 = s1.nextInt();
        System.out.println("Sum: " + (num1 + num2) + "\nProduct: " + (num1 * num2));
        s1.close();
    }
}
