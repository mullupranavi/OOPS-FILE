public class software
{
    public String name;
    public int employeeId;
    public software(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public String getname() {
        return name;
    }
    public int getemployeeId() {
        return employeeId;
    }
}
class RegularEmployee extends software {
    public RegularEmployee(String name, int employeeId) {
        super(name,employeeId);
    }
}
class Manager extends software {
    public Manager(String name, int employeeId) {
        super(name,employeeId);
    }
    public void bonus(int bonus) {
        System.out.println("a manager gets bonus upto: " + bonus);
    }
}
