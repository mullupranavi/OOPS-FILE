class Vehicle{
 String brand;
 int speed;
 public vehicle(){
   this.brand="unknown";
   this.speed=0;
 }
 void displayInfo(){
 System.out.println("Brand:"+brand);
 System.out.println("Speed:"+speed):
 }}
class car extends Vehicle{
  int doors;
  public car(String brand, int speed, int doors){
    this.brand = brand;
    this.speed = speed;
    this.doors = doors;
  }
  void display Cardetails(){
  System.out.println("Car has"+doors+"doors");
  }}
class bike extends Vehicle{
  Boolean has Gear;
  public Bike(String brand, int speed, boolean has gear){
     this.brand = brand;
     this.speed = speed;
     this.hasGear = hasGear;
  }
  void show bikedetails(){
  System.out.println("Bike hasGear"+hasGear);
