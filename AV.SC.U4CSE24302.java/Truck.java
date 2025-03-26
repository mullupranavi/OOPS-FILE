class Vehicle {
    void displayInfo() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void displayInfo() {
        System.out.println("This is Truck");
    }
}

class Truck {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displayInfo();
    }
}