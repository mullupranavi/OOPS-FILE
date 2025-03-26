import java.util.Scanner;

class aadhar{
 public static void main(String[]args){
   
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the proof");
    String proof=input.nextString();
    if(proof=Aadhar){
       System.out.println("Person is eligible");
    }
    else{
      System.out.println("Perosn is not eligible");
    }
  }
}