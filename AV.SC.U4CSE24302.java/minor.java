import java.util.Scanner;

class minor{
 public static void main(String[]args){
   
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the age");
    int age=input.nextInt();
    if(age>=18){
       System.out.println("Person is major");
     }

  }
}