import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <= size; i++) {
            System.out.println("enter " + i + " th element");
            arr[i - 1] = sc.nextInt();
        }
        
        System.out.println("your elements are ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        for(int i = 0 ; i<=size/2;i++){
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size-i-1 ] = temp;
        }
        System.out.println();
        System.out.println("this is your reversed array ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}