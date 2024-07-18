
import java.util.Scanner;

public class L_numberFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value of n: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n + 1; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
