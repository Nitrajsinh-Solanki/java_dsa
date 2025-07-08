import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        

        for(int i = 1 ; i<= num ; i++){
            for(int j = num ; j>= i ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*


5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

 */