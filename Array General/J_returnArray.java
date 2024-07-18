
import java.util.Arrays;
import java.util.Scanner;

public class J_returnArray {

    static int[] returnArray(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[2];
        ans[0] = arr[0];
        ans[1] = arr[arr.length - 1];
        return ans;
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

        int[] ans = returnArray(array);
        System.out.println("Returned array is:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
