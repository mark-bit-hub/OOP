import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1, num2, operand;
        System.out.print("Enter 1 for +\n" +
                          "Enter 2 for -\n" +
                          "Enter 3 for *\n" +
                          "Enter 4 for /\n" +
                          "Enter 5 to exit\n");
        operand = s1.nextInt();
        if (operand == 5) return;
        System.out.println("Enter num1 and num2: ");
        num1 = s1.nextInt();
        num2 = s1.nextInt();
        switch (operand) {
            case 1:
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Quotient: " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong operand, try again!");
        }
        s1.close();
    }
}
