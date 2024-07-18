
import java.util.Scanner;

public class A_numberOfDigits {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        sc.close();
        while (n != 0) {
            count++;
            n = n / 10;
        }
        System.out.println("The nummber of digits is: " + count);
    }
}
