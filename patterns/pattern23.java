import java.util.Scanner;
public class pattern23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        for(int i = 1 ; i<= num ; i++){
            for(int k = 1 ;k< i ;k++){
                System.out.print(" ");
            }
            for(int j = i ; j<= num ;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i = 1 ; i<= num ; i++){
            for(int k = num-i+1 ;k>= 1 ;k--){
                System.out.print(" ");
            }
            for(int j = 1 ; j<= i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}



/*

 * * * * *
  * * * *
   * * *
    * *
     *
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 

 */