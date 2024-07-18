
import java.util.Scanner;

public class G_suffixSum {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void prifixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static void suffixSumArray(int arr[]) {
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            arr[i] += arr[i + 1];
        }
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

        suffixSumArray(array);
        // prifixSum(array);
        printArray(array);
        sc.close();
    }
}
