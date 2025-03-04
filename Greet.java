import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter your name: ");
        name = s1.nextLine();
        System.out.print("Enter your age: ");
        age = s1.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old!");
        s1.close();
    }
}
