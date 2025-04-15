public class Animal {
    public String example(String name) {
        System.out.println("Example of an Animal: " + name);
        return name;
    }
    public void eat() {
        System.out.println("All the animals follow the food chain.");
    }
}
class Herbivores extends Animal {
    public void eat() {
        System.out.println("Herbivores eat grass.");
    }
    public String example(String name) {
        System.out.println("Example of a Herbivore: " + name);
        return name;
    }
}
class Carnivores extends Animal {
    public void eat() {
        System.out.println("Carnivores eat Herbivores.");
    }
    public String example(String name) {
        System.out.println("Example of a Carnivore: " + name);
        return name;
    }
}
class Omnivores extends Animal {
    public void eat() {
        System.out.println("Omnivores eat both Herbivores and Carnivores.");
    }
    public String example(String name) {
        System.out.println("Example of an Omnivore: " + name);
        return name;
    }
}
