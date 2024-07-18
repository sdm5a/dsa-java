
import java.util.Scanner;

public class A_printElementsOfArray {

    static void printElements(int[] arr, int indx) {
        if (indx == arr.length) {
            return;
        }

        System.out.print(arr[indx] + " ");
        printElements(arr, indx + 1);
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

        printElements(array, 0);
        sc.close();
    }
}
