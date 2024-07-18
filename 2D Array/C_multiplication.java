
import java.util.Scanner;

public class C_multiplication {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] multiplicationOfMatrices(int[][] m1, int[][] m2) {
        int r = m1.length;
        int c = m2[0].length;
        int ans[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of column of matrix1: ");
        int c1 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("Enter the element at (%d , %d) index: ", i, j);
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("*-----------------------*");
        System.out.print("Enter the number of rows of matrix2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of column of matrix2: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication is not posible.");
        } else {

            int[][] matrix2 = new int[r2][c2];

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.printf("Enter the element at (%d , %d) index: ", i, j);
                    matrix2[i][j] = sc.nextInt();
                }
            }

            int[][] ans = multiplicationOfMatrices(matrix1, matrix2);
            System.out.println("The multiplied matrix is: ");
            printMatrix(ans);

        }
        sc.close();
    }
}
