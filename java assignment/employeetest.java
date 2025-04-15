public class employeetest {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        Employee e = new Employee("Pooja", 2400000);
        System.out.println(e.getname() + "'s basic salary is: " + e.getsalary());
        e.work();
        HRmanager hr = new HRmanager("Vijay", 100000);
        System.out.println(hr.getname() + "'s basic salary is: " + hr.getsalary());
        hr.work();
        hr.addEmployee("Sree");
    }
}