import java.util.Calendar;
import java.util.GregorianCalendar;
public class Exercise {
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        if (args.length != 2) {
            System.out.println("Usage: java Exercise13_04 <month> <year>");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        printMonthTitle(year, month);
        printMonthBody(startDay, numberOfDaysInMonth);
    }
    public static void printMonthTitle(int year, int month) {
        String[] monthNames = {
            "", 
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        System.out.println("         " + monthNames[month] + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    public static void printMonthBody(int startDay, int numberOfDaysInMonth) {
        int currentDay = 1;
        for (int i = Calendar.SUNDAY; i < startDay; i++) {
            System.out.print("    ");
        }
        for (int i = startDay; currentDay <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", currentDay);
            if (i % 7 == 0) {
                System.out.println();
            }
            currentDay++;
        }
        System.out.println(); 
}}
