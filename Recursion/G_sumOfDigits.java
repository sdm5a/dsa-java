
import java.util.Scanner;

public class G_sumOfDigits {

    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        int k = n % 10;
        int sum = k;

        return sum + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of n is: " + sum);
        sc.close();
    }
}
