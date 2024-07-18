
import java.util.Scanner;

public class M_numberFormat2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print("21 ");
                } else {
                    System.out.print("12 ");
                }
            }
            System.out.println();
        }
    }
}
