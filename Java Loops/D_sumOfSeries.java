
import java.util.Scanner;

public class D_sumOfSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        sc.close();
        // 1-2+3-4+5-....+n. <--Series
        int sum = 0;
        for (int i = 0; i <= Math.abs(n); i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("The Sum upto n is: " + sum);
    }
}
