
import java.util.Scanner;

public class I_kMultipleOfN {

    static void kMultipleOfN(int n, int k) {
        if (k == 0) {
            return;
        }

        kMultipleOfN(n, k - 1);
        System.out.print(n * k + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("How many times you want to print its multiples: ");
        int k = sc.nextInt();
        kMultipleOfN(n, k);
        sc.close();
    }
}
