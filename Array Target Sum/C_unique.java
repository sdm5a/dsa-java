
import java.util.Scanner;

public class C_unique {

    static int uniqueNumber(int[] arr) {
        int target = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    target = arr[i];
                }
            }
        }
        return target;
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

        System.out.printf("Your unique number is: %d", uniqueNumber(array));
        sc.close();
    }
}
