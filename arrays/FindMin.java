import java.util.Scanner;

class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <= size; i++) {
            System.out.println("enter " + i + " th element");
            arr[i - 1] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("your elements are ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("minimum element is "+ min);

        sc.close();
    }
}