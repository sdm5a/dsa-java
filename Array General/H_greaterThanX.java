
import java.util.Scanner;

public class H_greaterThanX {

    static int greaterThan(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
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
        System.out.print("Enter the value of x:");
        int x = sc.nextInt();
        int ans = greaterThan(array, x);
        System.out.println("The total number of element strictly grater than x is: " + ans);
        sc.close();
    }
}
