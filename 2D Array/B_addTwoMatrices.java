
import java.util.Scanner;

public class B_addTwoMatrices {

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sumOfMatrices(int[][] mt1, int[][] mt2) {
        int r = mt1.length;
        int c = mt1[0].length;
        int ans[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = mt1[i][j] + mt2[i][j];
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

        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not posible.");
        } else {

            int[][] matrix2 = new int[r2][c2];

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.printf("Enter the element at (%d , %d) index: ", i, j);
                    matrix2[i][j] = sc.nextInt();
                }
            }

            int[][] ans = sumOfMatrices(matrix1, matrix2);
            System.out.println("The sum matrix is: ");
            printMatrix(ans);

        }

        sc.close();
    }
}
