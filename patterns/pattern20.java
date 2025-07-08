import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        

        for(int i = 1 ; i<= num ; i++){
            int n = i ;
            for(int j = 1 ; j<= i;j++){
                System.out.print(n + " ");
                n = n + 5 - j;
            }
            System.out.println();

        }

        sc.close();
    }
}

/*

1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15


 */