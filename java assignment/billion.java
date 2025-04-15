import java.util.Scanner;
public class billion {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number less than ten billion: ");
        int a = input.nextInt();
        int b = a;
        int i = 0;
        while (a>0) {
            a = a/10;
            i++;
        }
        if ( b == 0) {
            i = 1;
        }
        System.out.println("the number of digits in the number is: " +i );
        System.out.println("M.Pranavi");
        System.out.println("CSE-B");
        System.out.println("AV.SC.U4CSE24302");
        input.close();
    }
}