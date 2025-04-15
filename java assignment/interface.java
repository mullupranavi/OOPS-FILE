interface A { 
    void Method(); 
} 
class B { 
    public void Method() { 
        System.out.println("My Method"); 
    } 
} 
class C extends B implements A { 
} 
class Main2 { 
    public static void main(String[] args) { 
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        A a = new C(); 
        a.Method(); 
    } 
}