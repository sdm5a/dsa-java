
import java.util.Scanner;

public class H_pToThePowerQ {

    static int pRaiseToq(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return p * pRaiseToq(p, q - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the value p: ");
        int p = sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q = sc.nextInt();
        int ans = pRaiseToq(p, q);
        System.out.printf("The value of %d^%d is: %d", p, q, ans);
        sc.close();
    }
}
