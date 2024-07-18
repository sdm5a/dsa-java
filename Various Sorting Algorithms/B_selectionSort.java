
import java.util.Scanner;

public class B_selectionSort {

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

    static void selectionSort(int []arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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
        // int []array={4,3,2,5,2,7};

        sc.close();

        selectionSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
}
