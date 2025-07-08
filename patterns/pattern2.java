import java.util.Scanner;


public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        for(int i = 1 ; i<= num; i++){
            for(int j = num-i+1; j>=1 ; j--){
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