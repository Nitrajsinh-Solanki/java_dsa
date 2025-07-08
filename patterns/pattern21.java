import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        
        
        int count = 1 , decreaser;
        for(int i = 1 ; i<= num ; i++){
            
            for(int j =1 ; j<= num ;j++){
                count++;
                decreaser = count ; 
                System.out.print(decreaser+" ");
                decreaser--;
                
            }
            count = (count + num )-1;
            
            System.out.println();
        }

        sc.close();
    }
}

/*




 */