
import java.util.Scanner;

public class A_bubbleSortAlgo {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean flag;
        for (int i = 0; i < n; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }

            }

            if (flag == false) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        // taking input of array
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d]: ", i);
            array[i] = sc.nextInt();
        }

        sc.close();
        bubbleSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
