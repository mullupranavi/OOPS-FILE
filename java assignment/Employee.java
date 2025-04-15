public class Employee {
    String name;
    int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getname() {
        return name;
    }
    public int getsalary() {
        return salary;
    }
    public void work() {
        System.out.println(name + " is working under ABC technologies.");
    }
    
}
class HRmanager extends Employee {
    public HRmanager(String name, int salary) {
        super(name,salary);
    }
    public void work() {
        System.out.println(name + " is working as a HRmanager at ABC technologies.");
    }
    public void addEmployee(String employee) {
        System.out.println(name + " added " + employee + " to the Employee list.");
    }

}
