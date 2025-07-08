package searching_sorting;

public class countingSort {

    // function to find the maximum element in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // function to perform counting sort
    public static void counting_sort(int[] arr) {
        // find the maximum value in the array
        int max = findMax(arr);

        // create a count array of size max + 1
        int[] count = new int[max + 1];

        // store the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // overwrite original array with sorted values
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    // main method to test the sorting
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // call counting sort function
        counting_sort(arr);

        // print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
