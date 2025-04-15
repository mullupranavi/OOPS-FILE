abstract class Animal2 {
    abstract void sound();
}
class Lion extends Animal2 {
    void sound() {
    System.out.println("Lion roars in the jungle.");
    }
}
class Tiger extends Animal2 {
    void sound() {
        System.out.println("Tigers roar and attack secretly.");
    }
}
