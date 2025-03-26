class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calci {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum of 5 and 6:" + cal.add(5, 6));
        System.out.println("Sum of 2.3 and 4.5:" + cal.add(2.3, 4.5));
        System.out.println("Sum of 5 and 6:" + cal.add(5, 6));
    }
}