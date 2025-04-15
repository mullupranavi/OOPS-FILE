public class Employee1test {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        Manager m = new Manager("Sujitha", "St.avenue", 2500000, "Healthcare", 5);
        m.performancereport();
        System.out.println("Bonus given to Sujitha is: " + m.bonus());
        m.manageproject();

        Developer d = new Developer("Ravi", "westline", 2300000, "IT", "Javascript");
        d.performancereport();
        System.out.println("Bonus given to Ravi is: " + d.bonus());
        d.manageproject();
        
        Programmer p = new Programmer("Darmik", "southeast", 3000000, "Cybersecurity", "Java");
        p.performancereport();
        System.out.println("Bonus given to Darmikis : " + p.bonus());
        p.manageproject();

    }
}