
import java.util.Scanner;

public class E_turn90Degree {

    static int[][] tranpose(int arr[][], int r, int c) {
        int ans[][] = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[] reverse(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;

    }

    static int[][] rotate(int[][] arr, int r, int c) {
        int ans[][] = tranpose(arr, r, c);;
        for (int i = 0; i < r; i++) {
            ans[i] = reverse(ans[i]);
        }

        return ans;
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

        // turn90Degree(array);
        // tranpose(array, rows, column);
        int ans[][] = rotate(array, rows, column);

        printArray(ans);
        sc.close();
    }
}
