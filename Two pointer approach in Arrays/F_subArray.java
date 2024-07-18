
import java.util.Scanner;

public class F_subArray {

    static void prifixSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    static boolean equalSubArray(int arr[]) {
        boolean ans = false;
        prifixSum(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int suffix = arr[arr.length - 1] - arr[i];
            if (arr[i] == suffix) {
                ans = true;
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
        boolean ans = equalSubArray(array);
        System.out.println(ans);
        sc.close();
    }
}
