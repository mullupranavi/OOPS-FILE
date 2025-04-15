import java.util.Scanner;
public class Matrix {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int r = input.nextInt();
        System.out.print("Enter no.of columns: ");
        int c = input.nextInt();
        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] smat = new int[r][c];
        int[][] pmat = new int[r][c];
        System.out.print("Enter elements for mat1: ");
        for(int i = 0; i<r; i++) {
            for (int j = 0; j<c; j++) {
                mat1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements for mat2: ");
        for (int i = 0; i<r; i++) {
            for (int j = 0; j< c; j++) {
                mat2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i<r; i++) {
            for (int j = 0; j <c; j++) {
                smat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        if (r == c) {
            for (int i = 0; i< r; i++) {
                for (int j = 0; j < c; j++) {
                    pmat[i][j] = 0;
                    for (int k = 0; k<c; k++) {
                        pmat[i][j] += mat1[i][j] * mat2[k][j];
                    }  }  } }
        System.out.println("M.PranaVI");
        System.out.println("AV.SC.U4CSE24302");
        System.out.println("CSE-B");
        System.out.println("\nMatrix 1:");
        displayMatrix(mat1);
        System.out.println("\nMatrix 2:");
        displayMatrix(mat2);
        System.out.println("\nMatrix sum:");
        displayMatrix(smat);
        if (r == c) {
            System.out.println("\nMatrix Product:");
            displayMatrix(pmat);
        } else {
            System.out.println("not possible.");
        }
        input.close();
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j< matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); }
    }}
