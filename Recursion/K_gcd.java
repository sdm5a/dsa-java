
import java.util.Scanner;

public class K_gcd {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        int ans = gcd(x, y);
        System.out.printf("GCD of %d and %d is: %d", x, y, ans);
        sc.close();
    }
}
