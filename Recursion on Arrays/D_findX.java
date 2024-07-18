
import java.util.Scanner;

public class D_findX {

    static void findX(int[] arr, int indx, int x) {
        if (indx == arr.length) {
            System.out.println("No");
            return;
        }

        if (arr[indx] == x) {
            System.out.println("Yes");
        }

        findX(arr, indx + 1, x);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d]= ", i);
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x to find: ");
        int x = sc.nextInt();
        findX(array, 0, x);
        sc.close();
    }
}
