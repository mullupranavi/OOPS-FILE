interface Bird {
    abstract void fly();
    abstract void makesound();
}
class Eagle implements Bird {
    public void fly() {
        System.out.println("The Eagle flies up so high that no other bird can reach its height.");
    }
    public void makesound() {
        System.out.println("Eagles' sound ranges upto 2kHz.");
    }
}
class Hawk implements Bird {
    public void fly() {
        System.out.println("Hawks are the most violent predators and fly very fast.");
    }
    public void makesound() {
        System.out.println("Hawks sound like kee-eeee-arr");
    }
}

