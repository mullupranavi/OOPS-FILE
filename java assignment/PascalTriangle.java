public class PascalTriangle {
    public static void main(String[]args) {
        int r = 5;
        for(int i = 0; i<r; i++) {
            for(int j = 0; j<(r-i); j++) {
                System.out.print(" ");
            }
            int n = 1;
            for(int j = 0; j <=i; j++) {
                System.out.print(n + " ");
                n = n* (i - j)/(j + 1);
            }
            System.out.println( );
        }
        System.out.println("M.Pranavi");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
    }
}