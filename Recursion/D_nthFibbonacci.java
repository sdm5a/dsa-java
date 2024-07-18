
import java.util.Scanner;

public class D_nthFibbonacci {

    static int nthFibbonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return nthFibbonacci(n - 2) + nthFibbonacci(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thevalue of n: ");
        int n = sc.nextInt();
        int ans = nthFibbonacci(n);
        System.out.printf("%dth fibbonacci number is: %d", n, ans);
        sc.close();
    }
}
