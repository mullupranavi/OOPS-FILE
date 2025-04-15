public class VehicleTest2{
    public static void main(String[] args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        vehicle truck = new truck("TATA", "R-430", 2007, "Diesel");
        vehicle car = new car("HYUNDAI", "I 20 Sportz", 2022, "Petrol");
        vehicle motorcycle = new motorcycle("Pleasure", "5G", 2024, "Petrol");
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