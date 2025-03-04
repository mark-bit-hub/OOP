import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int marks;
        System.out.print("Enter your marks: ");
        marks = s1.nextInt();
        if (marks >= 90 && marks <= 100) System.out.print("Grade: A");
        else if (marks >= 80 && marks <= 89) System.out.print("Grade: B");
        else if (marks >= 70 && marks <= 79) System.out.print("Grade: C");
        else if (marks >= 60 && marks <= 69) System.out.print("Grade: D");
        else if (marks < 60 && marks >= 0) System.out.print("Grade: F");
        s1.close();
    }
}
