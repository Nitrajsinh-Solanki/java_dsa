package searching_sorting;

public class bubbleSort {

    public static void bubble_sort(int[] arr){
        int n = arr.length;

        for(int i = 0 ; i< n-1 ;i++){
            for(int j = 0 ; j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};

        bubble_sort(arr);
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
}



/*

Initial array: [5, 1, 4, 2, 8]


| Pass   | Comparison Pairs               | Action Taken                    | Array After Pass         |
| ------ | ------------------------------ | ------------------------------- | ------------------------ |
| 1      | (5,1) → Swap                   | \[**1,5**,4,2,8]                |                          |
|        | (5,4) → Swap                   | \[1,**4,5**,2,8]                |                          |
|        | (5,2) → Swap                   | \[1,4,**2,5**,8]                |                          |
|        | (5,8) → No Swap                | \[1,4,2,5,8]                    | ✅ 8 in final position    |
| ------ | ------------------------------ | ------------------------------- | ------------------------ |
| 2      | (1,4) → No Swap                | \[**1,4**,2,5,8]                |                          |
|        | (4,2) → Swap                   | \[1,**2,4**,5,8]                |                          |
|        | (4,5) → No Swap                | \[1,2,4,5,8]                    | ✅ 5 in final position    |
| ------ | ------------------------------ | ------------------------------- | ------------------------ |
| 3      | (1,2) → No Swap                | \[**1,2**,4,5,8]                |                          |
|        | (2,4) → No Swap                | \[1,2,4,5,8]                    | ✅ 4 in final position    |
| ------ | ------------------------------ | ------------------------------- | ------------------------ |
| 4      | (1,2) → No Swap                | \[**1,2**,4,5,8]                | ✅ 2 in final position    |


 */