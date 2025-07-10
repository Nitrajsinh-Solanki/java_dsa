// public class demo {
//     public static void main(String[] args) {
//         int[] arr = {3,2,7,4,1,2};
//         boolean found = false;
//         int temp = 0;
//         for(int i = 0 ; i< arr.length-1;i++){
//             int element = arr[i];
//             // for(int j = i+1;j< arr.length;j++){
//             //     if(element > arr[j]){
//             //         found = true;
//             //         arr[i] = arr[j];
//             //     }
//           //  }
//             // if(found == false){
//             //     arr[i] = -1;
//             // }
//             if(element < arr[i+1]){
//                 temp = arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1] = temp;
//             }
//             // else{
//             //     arr[i]= -1;
//             // }
//         }
//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }



class demo {
    public static void main(String[] args) {
        int[] arr = {3,2,7,4,1,2};
        
        for(int i = 0 ; i<arr.length ;i++){
            boolean found = false;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]> arr[i]){
                    arr[i] = arr[j];
                    found = true;
                    break;
                }
                if(i == arr.length-1){
                    arr[i] = -1;
                }
            }
            if(found == false){
                arr[i] = -1;
            }

        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}