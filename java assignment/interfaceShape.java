interface Shape {
    double getPerimeter();
}

class Rectangle implements Shape {
    public int l;
    public int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public double getPerimeter() {
        return 2 * (l + b);
    }
}

class Circle implements Shape {
    public int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

class Triangle implements Shape {
    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }
}

