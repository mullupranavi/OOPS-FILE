abstract class PatternPrinter {
    int rows;

    PatternPrinter(int rows) {
        this.rows = rows;
    }

    abstract void printPattern();

    void displayTitle(String title) {
        System.out.println("\n" + title);
    }
}

class StarPattern extends PatternPrinter {
    StarPattern(int rows) {
        super(rows);
    }

    void printPattern() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class NumberPattern extends PatternPrinter {
    NumberPattern(int rows) {
        super(rows);
    }

    void printPattern() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

public class Teststar {
    public static void main(String[] args) {
    System.out.println("Name:M.Pranavi,Section:B,Roll NO:AV.SC.U4CSE24302");
        int numberOfRows = 5;

        PatternPrinter star = new StarPattern(numberOfRows);
        star.displayTitle("Star Pattern");
        star.printPattern();

        PatternPrinter number = new NumberPattern(numberOfRows);
        number.displayTitle("Number Pattern");
        number.printPattern();
    }
}