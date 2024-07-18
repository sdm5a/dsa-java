
import java.util.Scanner;

public class F_pascalTriangle {

    static void printArray(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascalTriangle(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || i == j) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[][] ans = pascalTriangle(n);
        printArray(ans, n);
        sc.close();
    }
}
