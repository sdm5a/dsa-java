
import java.util.Scanner;

public class F_factorialNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to print factorial upto n: ");
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = 1;
            for (int j = 1; j <= i; j++) {
                fact = fact * j;
            }
            System.out.printf("Factorial of %d is: %d\n", i, fact);
        }
    }
}
