
import java.util.Scanner;

class grade{
  public static void main(String[]args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter the marks");
    int marks=input.nextInt();
    if(marks>90){
      System.out.println("Grade is O");
    }
      else if(90<marks>75){
       System.out.println("Grade is A");
    }
      else if(75<marks>30){
       System.out.println("Grade is B");
    } else {
      System.out.println("Grade is BAD");
      }     
  }
}
   