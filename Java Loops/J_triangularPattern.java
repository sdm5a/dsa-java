
import java.util.Scanner;

public class J_triangularPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("In reverse form -->");
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
