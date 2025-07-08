package searching_sorting;

public class quickSort{

    // function to perform quick sort
    public static void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            // find pivot position such that
            // elements on left are smaller, right are greater
            int pivotIndex = partition(arr, low, high);

            // recursively sort left part
            quick_sort(arr, low, pivotIndex - 1);

            // recursively sort right part
            quick_sort(arr, pivotIndex + 1, high);
        }
    }

    // function to place pivot element at correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1; // pointer for smaller element

        for (int j = low; j < high; j++) {
            // if current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot with the element at i+1 position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // return the pivot index
        return i + 1;
    }

    // main method to test the code
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 3, 1, 5};

        // call quick sort on full array
        quick_sort(arr, 0, arr.length - 1);

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
