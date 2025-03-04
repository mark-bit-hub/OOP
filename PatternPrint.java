import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter n for pattern: ");
        int n = s1.nextInt();

        for (int i = 1; i <= n; i++) { // Loop for rows
            for (int j = 1; j <= i; j++) { // Loop for columns
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        s1.close();
    }
}
