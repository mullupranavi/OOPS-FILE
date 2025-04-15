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

    public boolean isFilled() {
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

public class GeometricTest {
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");

        Triangle t = new Triangle(3, 4, 5, "Blue", true);
        System.out.println("Triangle sides: " + t.getS1() + ", " + t.getS2() + ", " + t.getS3());
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
        System.out.println("Details: " + t.details());
    }
}
