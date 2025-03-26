class Shape {
     double calculateArea(double side){
     return side*side;
    }

    double calculateArea(double width,double length){
    return width*length;
    }
}

class Circle extends Shape {
   double calculateArea(double radius){
     return 3.14*radius*radius;
    }
}

class Tools {
    public static void main(String[]args){
        Shape s = new Shape();
        Circle c = new Circle();
        System.out.println("Area of 4:"+ calculateArea(4));
        System.out.println("Area of 4 and 3:"+ calculateArea(4 , 3));
        System.out.println("Area of 2:"+ calculateArea(2));
    }
}

