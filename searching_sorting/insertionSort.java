package searching_sorting;

public class insertionSort {
    static void insertionMethod(int[] arr){
        int n = arr.length;
        for(int i = 1;i< n ;i++){
            int key = arr[i];
            int j = i-1;
            while(j>= 0 && arr[j] >key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {


        int arr[] = {9,8,7,6,5,4,3,2,1};

        insertionMethod(arr);
        for(int num :arr){
            System.out.print(num+" ");
        }

    }
}



/*
| Step | Array State          | Explanation               |
| ---- | -------------------- | ------------------------- |
| 1    | \[**5**, 3, 4, 1, 2] | 5 is considered sorted    |
| 2    | \[**3**, 5, 4, 1, 2] | Insert 3 before 5         |
| 3    | \[3, **4**, 5, 1, 2] | Insert 4 between 3 and 5  |
| 4    | \[**1**, 3, 4, 5, 2] | Insert 1 at the beginning |
| 5    | \[1, **2**, 3, 4, 5] | Insert 2 between 1 and 3  |



 */