public class Caluclator{
    public int add(int a, int b){
         int add=a+b;
        return add;
    }
    public int subtract(int a,int b){
         int subtract=a-b;
        return subtract;
    }
    public int multiply(int a,int b){
         int multiply=a*b;
         return multiply;
    }
    public float divide(int a,int b){
         int divide=a/b;
        return divide;
    }
    public static void main(String args[]){
    Caluclator c=new Caluclator();
    int add=c.add(26,19);
    int subtract=c.subtract(26,19);
    int multiply=c.multiply(26,19);
    float divide=c.divide(26,19);
    System.out.println("add:"+add);
    System.out.println("subtract:"+subtract);
    System.out.println("multiply:"+multiply);
    System.out.println("divide:"+divide);
    }
}