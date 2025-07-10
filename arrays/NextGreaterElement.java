public class NextGreaterElement {
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
