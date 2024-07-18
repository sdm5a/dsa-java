
import java.util.Scanner;

public class K_querryOnArray {

    static int[] frequencyArray(int arr[]) {
        int[] freq = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] = 1;
        }
        return freq;
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

        int[] ans = frequencyArray(array);
        System.out.print("Enter number of querries: ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.print("Enter any number to find: ");
            int x = sc.nextInt();
            if (ans[x] == 1) {
                System.out.printf("%d is present in this array.\n", x);
            } else {
                System.out.printf("%d is not present in this array.\n", x);
            }
            q--;
        }
        sc.close();

    }
}
