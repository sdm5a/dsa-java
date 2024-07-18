
import java.util.Scanner;

public class A_takeInputAndPrint {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
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

        printArray(array);
        sc.close();
    }
}
