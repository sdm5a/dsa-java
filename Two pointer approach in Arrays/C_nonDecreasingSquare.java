
import java.util.Scanner;

public class C_nonDecreasingSquare {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int temp = arr[i];
            arr[i] = arr[n - 1];
            arr[n - 1] = temp;
            i++;
            n--;
        }
    }

    static int[] nonDecreasingSquare(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int k = 0;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
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

        int ans[] = nonDecreasingSquare(array);
        reverse(ans);
        printArray(ans);
        sc.close();
    }
}
