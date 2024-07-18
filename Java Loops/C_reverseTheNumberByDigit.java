
import java.util.Scanner;

public class C_reverseTheNumberByDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        int revNum = 0;
        while (n != 0) {
            int k = n % 10;
            revNum = revNum * 10 + k;
            n /= 10;
        }
        System.out.println("Reversed number is: " + revNum);
    }
}
