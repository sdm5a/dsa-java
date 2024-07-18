
import java.util.Scanner;

public class A_totalPairs {

    static int totalPairs(int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
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

        System.out.print("Enter the target sum: ");
        int x = sc.nextInt();
        System.out.printf("Total number of pairs whose sum is equal to %d is: %d", x, totalPairs(array, x));
        sc.close();
    }
}
