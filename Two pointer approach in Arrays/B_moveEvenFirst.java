
import java.util.Scanner;

public class B_moveEvenFirst {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] move(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                ans[j++] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                ans[j++] = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element of array of %d index: ", i);
            array[i] = sc.nextInt();
        }
        int ans[] = move(array);
        printArray(ans);
        sc.close();
    }
}
