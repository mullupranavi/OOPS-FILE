abstract class geometricobject {
    public String color = "white";
    public boolean filled;
    public geometricobject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getcolor() {
        return color;
    }
    public boolean getfilled() {
        return filled;
    }
    public String details() {
        return "color: " + color + " filled: " + filled;
    }
}
class triangle extends geometricobject {
    public int s1;
    public int s2;
    public int s3;
    public triangle(int s1, int s2, int s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3; }
    public int gets1() {
        return s1; }
    public int gets2() {
        return s2;}
    public int gets3() {
        return s3; }
    public int perimeter() {
        return s1+s2+s3;
    }
    public double area() {
        double s = (s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }}
 import java.util.Scanner;
    public class geometricobject2 {
        public static void main(String[]args) {
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
            System.out.print("Enter color: ");
            String color = input.nextLine();
            input.nextLine();
            System.out.print("Is the triangle filled(true/false): ");
            boolean filled = input.nextBoolean();
            triangle t = new triangle(s1, s2, s3, color, filled);
            System.out.println("Triangle Details: ");
            System.out.println("Area: " + t.area());
            System.out.println("Perimeter: " + t.perimeter());
            System.out.println("Color: " + t.getcolor());
            System.out.println("Filled: " + t.getfilled());
            input.close();
        }
    }