
import java.util.Scanner;

public class J_alternateSum {

    static int alternateSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return alternateSum(n - 1) - n;
        } else {
            return alternateSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = alternateSum(n);
        System.out.println("Total sum: " + ans);
        sc.close();
    }
}
