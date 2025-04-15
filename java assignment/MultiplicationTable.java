import java.util.Scanner;
public class MultiplicationTable  {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Table to be calculated: " );
        int x = input.nextInt();
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        for (int i= 0; i<=n; i++) {
            System.out.println( x + "X" + i + "=" + (x*i) );
        }
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        input.close();
    }
}
