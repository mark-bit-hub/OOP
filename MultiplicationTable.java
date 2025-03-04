import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = s1.nextInt();
        for (int count = 1; count <= num; count++) {
            System.out.println(count + " x " + num + " = " + (count * num));
        }
        s1.close();
    }
}
