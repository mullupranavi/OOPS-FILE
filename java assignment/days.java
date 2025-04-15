import java.util.Scanner;
public class days {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number(1-7): " );
        int n = input.nextInt();
        String day = nu6ll;
        if (n==1) {
            day = "Monday";
        } else if (n==2) {
            day = "Tuesday";
        } else if (n==3) {
            day = "Wednesday";
        } else if (n==4) {
            day = "Thursday";
        } else if  (n==5) {
            day = "Friday";
        } else if (n==6) {
            day = "Saturday";
        } else if  (n==7) {
            day = "Sunday";
        } else {
            System.out.println("invalid number");
        }
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        System.out.println("the weekday is: " + day );
        input.close();
    }
 }