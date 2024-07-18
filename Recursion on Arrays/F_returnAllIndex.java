
import java.util.Scanner;

public class F_returnAllIndex {

    static void returnAllIndex(int[] arr, int indx, int x) {
        if (indx == arr.length) {
            return;
        }

        if (arr[indx] == x) {
            System.out.println(indx);
        }

        returnAllIndex(arr, indx + 1, x);

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
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        sc.close();

        returnAllIndex(array, 0, x);
    }
}
