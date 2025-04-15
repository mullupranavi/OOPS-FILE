public class ShapeTest1 {
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");

        Shape r = new Rectangle(3, 6);
        System.out.println("The perimeter of the given rectangle: " + r.getPerimeter());

        Shape c = new Circle(4);
        System.out.println("The perimeter of the given circle: " + c.getPerimeter());

        Shape t = new Triangle(2, 4, 5);
        System.out.println("The perimeter of the given triangle: " + t.getPerimeter());
    }
}
