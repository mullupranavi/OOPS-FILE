public class EvenNumberExceptionExample {

    public static void checkNumber(int number) throws Exception {
        if (number % 2 == 0) {
            throw new Exception("Even number not allowed: " + number);
        } else {
            System.out.println("Valid odd number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(4);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
