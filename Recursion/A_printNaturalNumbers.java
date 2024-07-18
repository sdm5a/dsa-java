
import java.util.Scanner;

public class A_printNaturalNumbers {

    static void naturalNumbers(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // recursive work
        naturalNumbers(n - 1);
        // self work
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        naturalNumbers(n);
        sc.close();
    }
}
