public class Animaltest {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        Animal a = new Animal();
        Herbivores h = new Herbivores();
        Carnivores c = new Carnivores();
        Omnivores o = new Omnivores();
        a.eat();
        h.eat();
        h.example("Grasshopper");
        c.eat();
        c.example("Lion");
        o.eat();
        o.example("Humans");

    }
}