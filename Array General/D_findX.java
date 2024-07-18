
import java.util.Scanner;

public class D_findX {

    static int findX(int[] array, int x) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // to take input of array element
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at %d index: ", i);
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x to find in array: ");
        int x = sc.nextInt();
        int ans = findX(array, x);
        System.out.println("X found at index of: " + ans);
        sc.close();

    }
}
