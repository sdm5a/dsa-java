
import java.util.Scanner;

public class B_sumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        while (n != 0) {
            int k = n % 10;
            sum += k;
            n /= 10;
        }
        System.out.println("THe total sum of digits is: " + sum);
    }
}
