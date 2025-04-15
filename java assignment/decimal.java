import java.util.Scanner;
public class decimal {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = input.nextDouble();
        System.out.println("Enter b number: ");
        double b = input.nextDouble() ;
        if (a == b) {
            System.out.println("They are the same upto three decimal places.");
        } else {
            System.out.println("They are not the same upto three decimal places.");
        }
        System.out.println("M.Pranavi");
        System.out.println("CSE-B");
        System.out.println("AV.SC.U4CSE24302");
        input.close();
    }
}