import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter num1 and num2: ");
        num1 = s1.nextInt();
        num2 = s1.nextInt();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1: " + num1 + "\nnum2: " + num2);
        s1.close();
    }
}
