import java.util.Scanner;


public class pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        for(int i = 1 ; i<= num ; i++){
            for(int j = 1 ; j<= num ; j++){
                if(i==1 || i==num || j==1 || j== num){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}

/*

 *  *  *  *  * 
 *           * 
 *           * 
 *           * 
 *  *  *  *  * 




 */
