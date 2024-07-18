
import java.util.Scanner;

public class B_findTriplet {

    static int findTriplet(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
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

        System.out.print("Enter the target x: ");
        int x = sc.nextInt();

        System.out.printf("Number of triplets whose sum is equal to %d is: %d", x, findTriplet(array, x));
        sc.close();
    }
}
