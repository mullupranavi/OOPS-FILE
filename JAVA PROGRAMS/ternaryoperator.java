import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();
        String result = (marks > 40) ? "pass" : "fail";
        System.out.println("you" + result + "the exam.");
        input.close();

    }  
}