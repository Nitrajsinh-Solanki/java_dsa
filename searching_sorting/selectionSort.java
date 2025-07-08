package searching_sorting;

public class selectionSort {
    public static void swap(int[] arr,int i , int minIndex){
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            int minELement = arr[i];
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < minELement){
                    minELement = arr[j];
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};

        selection_sort(arr);
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
}


/*
| Pass | Unsorted Part      | Min Value | Swap With    | Array After Pass   |
| ---- | ------------------ | --------- | ------------ | ------------------ |
| 1    | 29, 10, 14, 37, 13 | 10        | 29           | 10, 29, 14, 37, 13 |
| 2    | 29, 14, 37, 13     | 13        | 29           | 10, 13, 14, 37, 29 |
| 3    | 14, 37, 29         | 14        | 14 (no swap) | 10, 13, 14, 37, 29 |
| 4    | 37, 29             | 29        | 37           | 10, 13, 14, 29, 37 |
| 5    | Only 37 left       | -         | -            | Already sorted     |

 */
