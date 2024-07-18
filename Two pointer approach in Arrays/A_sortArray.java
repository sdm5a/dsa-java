
import java.util.Scanner;

public class A_sortArray {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sortArray(int[] arr) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 0 || arr[j] == 1) {
                if (arr[i] == 0) {
                    i++;
                }
                if (arr[j] == 1) {
                    j--;
                }
            }
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the element of array of %d index: ", i);
            array[i] = sc.nextInt();
        }
        sortArray(array);
        printArray(array);
        sc.close();
    }
}
