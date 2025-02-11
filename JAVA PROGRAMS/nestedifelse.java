public class nestedifelse {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 4;
        int n3 = 6, largest;
        if (n1>=n2) {
            if (n1>= n3){
                largest = n1;
            }
            else {
                largest = n3;
            } 
        } else {
            if (n2>= n3) {
                largest = n2;
            }
            else {
                largest = n3;
            }
        }
        System.out.println("The largest number is:" + largest);
    }
}