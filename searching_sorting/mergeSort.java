package searching_sorting;

public class mergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        // creating temp array
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        // copying data in the temp array
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j + 1];
        }

        //merge temp arrays 
        int i = 0 , j = 0, k = start;
        while(i<left.length && j<right.length){
            if(left[i]<= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        //copy remaining elements 
        while(i < left.length ) {
            arr[k++] = left[i++];
        }
        while(j < right.length ) {
            arr[k++] = right[j++];
        }

    }

    public static void merge_sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // sorting left part
            merge_sort(arr, start, mid);
            // sorting right part
            merge_sort(arr, mid + 1, end);

            // merging two array
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        merge_sort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
