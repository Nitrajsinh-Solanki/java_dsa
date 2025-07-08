public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 30, 20, 40 };
        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}