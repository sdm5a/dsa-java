
import java.util.Scanner;

public class C_maxValue {

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

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("The maximum value is: " + max);
        sc.close();
    }
}
