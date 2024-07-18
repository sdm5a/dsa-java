
import java.util.Scanner;

public class B_nToOne {

    static void nToOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");

        nToOne(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        nToOne(n);
        sc.close();
    }
}
