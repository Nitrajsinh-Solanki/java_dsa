public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}