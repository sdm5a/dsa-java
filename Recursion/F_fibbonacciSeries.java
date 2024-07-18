
import java.util.Scanner;

public class F_fibbonacciSeries {

    static int nthFibbonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return nthFibbonacci(n - 2) + nthFibbonacci(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            int ans = nthFibbonacci(i);
            System.out.print(ans + " ");
        }
        sc.close();

    }

}
