
import java.util.Scanner;

public class H_oneToNsquareSpiral {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] oneToNsquareSpiral(int n) {
        int[][] arr = new int[n][n];

        int totalElements = 0;
        int topRow = 0, bottomRow = n - 1, leftColumn = 0, rightColumn = n - 1;

        while (totalElements < n * n) {
            // top row
            for (int j = leftColumn; j <= rightColumn && totalElements < n * n; j++) {
                arr[topRow][j] = totalElements * totalElements;
                totalElements++;

            }
            topRow++;
            // right column
            for (int j = topRow; j <= bottomRow && totalElements < n * n; j++) {
                arr[j][rightColumn] = totalElements * totalElements;
                totalElements++;

            }
            rightColumn--;
            // bottom row
            for (int j = rightColumn; j >= leftColumn && totalElements < n * n; j--) {
                arr[bottomRow][j] = totalElements * totalElements;
                totalElements++;

            }
            bottomRow--;
            // left column
            for (int j = bottomRow; j >= topRow && totalElements < n * n; j--) {
                arr[j][leftColumn] = totalElements * totalElements;
                totalElements++;

            }
            leftColumn++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int ans[][] = oneToNsquareSpiral(n);
        printArray(ans);
        sc.close();
    }
}
