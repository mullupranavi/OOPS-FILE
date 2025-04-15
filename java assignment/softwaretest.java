public class softwaretest {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        software s = new software("Shiva", 101526);
        RegularEmployee re = new RegularEmployee("Keerthi", 145926);
        Manager m = new Manager("Shanvith", 246789);
        System.out.println("A software company consists of a Boss named " + s.getname()); 
        System.out.println(re.getname() + " is a regular employee.");
        System.out.println(m.getname() + " is their manager.");
        m.bonus(25000);
    }
}