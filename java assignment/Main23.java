 class VisibilityExample {
    public int publicVariable = 10;
    private int privateVariable = 20;
    public int getprivateVariable() {
      return privateVariable;
    }
    public void setprivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }
    public int PublicVariable() {
        return publicVariable;
    }
    public void publicMethod() {
        System.out.println("This is a public method");
        privateMethod();
    }
    private void privateMethod() {
        System.out.println("This is a private method");
    }
}
public class Main23 {
    public static void main(String[]args) {
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        VisibilityExample obj = new VisibilityExample();
        System.out.println("public Variable: " + obj.PublicVariable());
        System.out.println("private Variable: " + obj.getprivateVariable());
        obj.publicMethod();
    }}
