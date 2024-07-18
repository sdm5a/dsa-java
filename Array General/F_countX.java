
import java.util.Scanner;

public class F_countX {

    static int countX(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
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
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Number of occrence of x is: " + countX(array, x));
        sc.close();
    }
}
