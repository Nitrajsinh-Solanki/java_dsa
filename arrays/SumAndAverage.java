import java.util.Scanner;

class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i <= size; i++) {
            System.out.println("enter " + i + " th element");
            arr[i - 1] = sc.nextInt();
        }
        float sum = 0;
        
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];
        }
        System.out.println("your elements are ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("sum of  element is "+ sum);
        System.out.println("average of  element is "+ sum/size);

        sc.close();
    }
}