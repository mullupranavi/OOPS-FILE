import java.util.Scanner;

abstract class GeometricObject {
    public String color = "white";
    public boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public String details() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    public int s1;
    public int s2;
    public int s3;

    public Triangle(int s1, int s2, int s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int getS1() {
        return s1;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }

    public int perimeter() {
        return s1 + s2 + s3;
    }

    public double area() {
        double s = (s1 + s2 + s3) / 2.0;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}

public class GeometricObject2 {
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter s1: ");
        int s1 = input.nextInt();

        System.out.print("Enter s2: ");
        int s2 = input.nextInt();

        System.out.print("Enter s3: ");
        int s3 = input.nextInt();

        input.nextLine(); 
        System.out.print("Enter color: ");
        String color = input.nextLine();

        System.out.print("Is the triangle filled (true/false): ");
        boolean filled = input.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3, color, filled);

        System.out.println("\nTriangle Details:");
        System.out.println("Area: " + t.area());
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Color: " + t.getColor());
        System.out.println("Filled: " + t.getFilled());

        input.close();
    }
}
