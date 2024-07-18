
import java.util.Scanner;

public class I_sortedOrNot {

    static boolean sorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
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
        boolean ans = sorted(array);
        if (ans) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Not Sorted.");
        }
        sc.close();
    }
}
