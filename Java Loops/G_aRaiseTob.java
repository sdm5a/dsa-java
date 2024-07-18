
import java.util.Scanner;

public class G_aRaiseTob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("a riase to b is: " + ans);
    }
}
