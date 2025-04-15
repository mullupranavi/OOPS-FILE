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

