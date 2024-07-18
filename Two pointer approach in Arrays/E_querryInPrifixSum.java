
import java.util.Scanner;

public class E_querryInPrifixSum {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void prifixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] array = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            System.out.printf("Enter the element of array of %d index: ", i);
            array[i] = sc.nextInt();
        }

        prifixSum(array);
        System.out.print("Enter the number of querries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter the value of l: ");
            int l = sc.nextInt();
            System.out.print("Enter the value of r: ");
            int r = sc.nextInt();
            int sum = array[r] - array[l - 1];
            System.out.println("Total sum between l and r is: " + sum);
            q--;
        }
        sc.close();

    }
}
