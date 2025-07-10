// import java.util.Scanner;


// public class pattern3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int num = sc.nextInt();
//         for(int i = 1 ; i<= num ; i++){
//             if(i<= num/2){
//                 for(int j = 1 ; j<= i;j++){
//                     System.out.print(" * ");
//                 }
//                 System.out.println();
//             }
//             else{
//                 for(int j = (num-i+1); j>= 1 ;j--){
//                     System.out.print(" * ");
//                 }
//                 System.out.println();
//             }
//         }


//         sc.close();
//     }
// }


import java.util.Scanner;


public class pattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        for(int i = 1 ; i<= num ; i++){
            int j=0;
            while(j >=0 && j< num){
                if(i<=num/2){
                    System.out.print(" * ");
                    j++;
                }
                if(i>(num/2)+1){
                    System.out.print(" * ");
                    j--;
                }

            }
            System.out.println();
        }


        sc.close();
    }
}




/* 


* 
*  *
*  *  *
*  *
*



*/