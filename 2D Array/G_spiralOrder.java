
import java.util.Scanner;

public class G_spiralOrder {

    static void spiralOrder(int[][] arr, int r, int c) {
        int totalElements = 0;
        int n = r * c;
        int topRow = 0, bottomRow = r - 1, leftColumn = 0, rightColumn = c - 1;
        while (totalElements < n) {
            // top row
            for (int j = leftColumn; j <= rightColumn && totalElements < r * c; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElements++;

            }
            topRow++;
            // right column
            for (int j = topRow; j <= bottomRow && totalElements < r * c; j++) {
                System.out.print(arr[j][rightColumn] + " ");
                totalElements++;

            }
            rightColumn--;
            // bottom row
            for (int j = rightColumn; j >= leftColumn && totalElements < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElements++;

            }
            bottomRow--;
            // left column
            for (int j = bottomRow; j >= topRow && totalElements < r * c; j--) {
                System.out.print(arr[j][leftColumn] + " ");
                totalElements++;

            }
            leftColumn++;
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

        spiralOrder(array, rows, column);
        sc.close();

    }
}
