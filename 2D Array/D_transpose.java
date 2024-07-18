
import java.util.Scanner;

public class D_transpose {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void tranpose(int[][] arr, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int column = sc.nextInt();

        int[][] array = new int[rows][column];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter the element at (%d,%d) index: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }
        tranpose(array, rows, column);
        // printArray(array);
        sc.close();

    }
}
