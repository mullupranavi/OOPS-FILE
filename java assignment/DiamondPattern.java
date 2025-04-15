import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);PROGRAM-11
                AIM 
                Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance travelled, and maximum speed.
                
                CODE: 
                abstract class vehicle {
                    public String make;
                    public String model;
                    public int year;
                    public String fueltype;
                    public vehicle(String make, String model, int year, String fueltype) {
                        this.make = make;
                        this.model = model;
                        this.year = year;
                        this.fueltype = fueltype;
                    }
                    abstract double fuelefficiency();
                    abstract double maxspeed();
                    public double distancetravelled(double fuelused) {
                        return fuelefficiency()*fuelused;
                    }
                    public String getmake() {
                        return make;
                    }
                    public String getmodel() {
                        return model;
                    }
                    public int getyear() {
                        return year;
                    }
                    public String getfueltype() {
                        return fueltype;
                    }
                }
                class truck extends vehicle {
                    public truck(String make, String model, int year, String fueltype) {
                        super(make, model, year, fueltype);
                    }
                    public double fuelefficiency() {
                        return 5.5;
                    }
                    public double maxspeed() {
                        return 145.0;
                    }
                }
                class car extends vehicle {
                    public car(String make, String model, int year, String fueltype) {
                        super(make, model, year, fueltype);
                    }
                    public double fuelefficiency() {
                        return 6.0;
                    }
                    public double maxspeed() {
                        return 150.0;
                    }
                }
                class motorcycle extends vehicle {
                    public motorcycle(String make, String model, int year, String fueltype) {
                        super(make, model, year, fueltype);
                    }
                    public double fuelefficiency() {
                        return 7.0;
                    }
                    public double maxspeed() {
                        return 155.0;
                    }
                    
                }
                
                public class vtest {
                    public static void main(String[] args) {
                        System.out.println("Kasi Harini");
                        System.out.println("AV.SC.U4CSE24203");
                        System.out.println("CSE-C");
                        vehicle truck = new truck("Ford", "F-150", 2023, "Diesel");
                        vehicle car = new car("Toyota", "Corolla", 2022, "Petrol");
                        vehicle motorcycle = new motorcycle("Yamaha", "YZF-R1", 2021, "Petrol");
                        System.out.println("truck details:");
                        System.out.println("Make: " + truck.getmake() + ", Model: " + truck.getmodel());
                        System.out.println("Fuel Efficiency: " + truck.fuelefficiency() + " km/l");
                        System.out.println("Max Speed: " + truck.maxspeed() + " km/h");
                        System.out.println("Distance travelled:" + truck.distancetravelled(10) + " km");
                        System.out.println();
                
                        System.out.println("car details:");
                        System.out.println("Make: " + car.getmake() + ", Model: " + car.getmodel());
                        System.out.println("Fuel Efficiency: " + car.fuelefficiency() + " km/l");
                        System.out.println("Max Speed: " + car.maxspeed() + " km/h");
                        System.out.println("Distance traveled with 10 liters of fuel: " + car.distancetravelled(10) + " km");
                        System.out.println();
                
                        System.out.println("motorcycle details:");
                        System.out.println("Make: " + motorcycle.getmake() + ", Model: " + motorcycle.getmodel());
                        System.out.println("Fuel Efficiency: " + motorcycle.fuelefficiency() + " km/l");
                        System.out.println("Max Speed: " + motorcycle.maxspeed() + " km/h");
                        System.out.println("Distance traveled with 10 liters of fuel: " + motorcycle.distancetravelled(10) + " km");
                    }
                }
            }
            for (char c = (char) ('A' + i - 2); c >= 'A'; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (char c = 'A'; c < 'A' + i; c++) {
                System.out.print(c);
            }
            for (char c = (char) ('A' + i - 2); c >= 'A'; c--) {
                System.out.print(c);
            }
            System.out.println();
        }

        input.close();
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
    }
}