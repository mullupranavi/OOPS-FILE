import java.util.ArrayList;
import java.util.List;
public class Student {
    private int studentid;
    private String name;
    private List<Integer> grades;
    public Student(int studentid, String name) {
        this.studentid = studentid;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public int getstudentid() {
        return studentid;
    }
    public void setstudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public void addgrade(int grade) {
        if (grade>=0 && grade<=100) {
            grades.add(grade);
            System.out.println("grade added: " + grade);
        } else {
            System.out.println("Invalid grade entered.");
        }
    }
    public void studentinfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentid);
        System.out.println("Grade: " + grades);
    }
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        Student s = new Student(241325, "Subha" );
        s.addgrade(84);
        s.addgrade(98);
        s.addgrade(99);
        s.studentinfo();
        }
}
