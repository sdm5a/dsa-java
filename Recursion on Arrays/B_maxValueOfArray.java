
import java.util.Scanner;

public class B_maxValueOfArray {

    static int maxValue(int[] arr, int indx) {
        if (indx == arr.length) {
            return 0;
        }

        int smallAns = maxValue(arr, indx + 1);
        return Math.max(arr[indx], smallAns);
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

        int ans = maxValue(array, 0);
        System.out.print("Maximum value of array is: " + ans);
        sc.close();
    }
}
