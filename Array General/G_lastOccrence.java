
import java.util.Scanner;

public class G_lastOccrence {

    static int lasrOccurence(int arr[], int x) {
        int ls = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ls = i;
            }
        }
        return ls;
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

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Last Occurence of x is at index of: " + lasrOccurence(array, x));
        sc.close();
    }
}
