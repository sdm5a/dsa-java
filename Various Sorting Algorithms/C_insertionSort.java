public class C_insertionSort {

    static void insertionSort(int []arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int j=i;

            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int []array={4,2,6,9,1};
        insertionSort(array);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
