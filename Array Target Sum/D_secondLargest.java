
import java.util.Arrays;
import java.util.Scanner;

public class D_secondLargest {

    static int secondLargest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element of array at index of %d: ", i);
            array[i] = sc.nextInt();
        }

        System.out.printf("Second larget element: %d", secondLargest(array));
        sc.close();
    }
}
