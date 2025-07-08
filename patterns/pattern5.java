import java.util.Scanner;


public class pattern5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        for(int i = 1 ; i <= num ; i++){

             for(int k = 1 ; k< i;k++){
                System.out.print("   ");
             }
             for(int j = num-i+1;j>= 1 ; j--){
                System.out.print(" * ");
             }
             System.out.println();
        }


        sc.close();
    }
}

/*

 *  *  *  *  * 
    *  *  *  *
       *  *  *
          *  *
             *




 */
