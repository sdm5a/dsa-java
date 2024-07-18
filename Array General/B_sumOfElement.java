
import java.util.Scanner;

public class B_sumOfElement {

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

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println();
        System.out.println("The total sum of all these element of array is: " + sum);
        sc.close();
    }
}
