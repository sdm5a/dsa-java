
import java.util.Scanner;

public class C_sumOfElements {

    static int sumOfElements(int arr[], int indx) {
        if (indx == arr.length) {
            return 0;
        }

        return arr[indx] + sumOfElements(arr, indx + 1);
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

        int ans = sumOfElements(array, 0);
        System.out.println("Sum of elements of this array is: " + ans);
        sc.close();
    }
}
