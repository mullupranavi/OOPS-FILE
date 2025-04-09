abstract class Shape3D {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    int radius;

    Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

class Cube extends Shape3D {
    int edge;

    Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(edge, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Sphere s = new Sphere(4);
        System.out.println("Sphere Volume: " + s.calculateVolume());
        System.out.println("Sphere Surface Area: " + s.calculateSurfaceArea());
        
        Cube c = new Cube(3);
        System.out.println("Cube Volume: " + c.calculateVolume());
        System.out.println("Cube Surface Area: " + c.calculateSurfaceArea());
        System.out.println("M.PRANAVI,Roll no : 24302,CSE-B");

    }
}
