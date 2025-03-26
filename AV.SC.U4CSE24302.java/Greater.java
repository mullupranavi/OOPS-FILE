import java.util.Scanner;
class greater{
   public static voidmain(String[]args){
     
   Scanner input=new Scanner(System.in);
   System.out.println("Enter a");
   int a=input.nextInt();
   System.out.println("Enter b");
   int b=input.nextInt();
   System.out.println("Enter c");
   int c=input.nextInt();
   int greatest = (a>=b) ? (a>=c) ? a:c): ((b>=c)? b:c);
   System.out.println(greatest);
        
        input.close();
    }
}
