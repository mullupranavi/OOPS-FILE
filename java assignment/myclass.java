public class myclass {
    static int count = 0;
    final double pi = 3.14;
    public myclass() {
        count++;
    }
    public static void main(String[] args) {
        myclass obj1 = new myclass();
        myclass obj2 = new myclass();
        myclass obj3 = new myclass();

        System.out.println("M.Pranavi");
        System.out.println("CSE-B");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("count: " + count);
        System.out.println("Value of pi: " + obj1.pi); 
        System.out.println("Value of pi: "+  obj2.pi);
        System.out.println("Value of pi: " + obj3.pi);
    }
}