
import java.util.Scanner;

// linear traversing
public class A_traversing {

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

        // for traversing 
        System.out.println("The given array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}
