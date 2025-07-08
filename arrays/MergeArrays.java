public class MergeArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }
        System.out.println("Merged array:");
        for (int val : merged) {
            System.out.print(val + " ");
        }
    }
}