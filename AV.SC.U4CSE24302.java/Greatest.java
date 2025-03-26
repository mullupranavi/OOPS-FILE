import java.util.Scanner;

class Greatest {
    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1");
        int num1 = input.nextInt();

        System.out.println("Enter num2");
        int num2 = input.nextInt();

        String greatest = num1 > num2 ? "num1 is greatest" : "num2 is greatest";
        System.out.println(greatest);
        
        input.close();
    }
}
