
import java.util.Scanner;

public class C_factorialN {

    static int factorialN(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialN(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = factorialN(n);
        System.out.println("Factorial of n is: " + ans);
        sc.close();
    }
}
