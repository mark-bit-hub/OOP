import java.util.Scanner;

public class IsEvenOdd {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = s1.nextInt();
        if (num % 2 != 0) System.out.println(num + " is odd");
        else System.out.println(num + " is even");
        s1.close();
    }
}
