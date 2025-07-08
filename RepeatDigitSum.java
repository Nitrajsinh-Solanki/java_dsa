import java.util.Scanner;

public class RepeatDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        int res = repeatSum(num);
        System.out.println("single digit sum is " + res);
        sc.close();
    
    }

    public static int repeatSum(int num){

        while(num >= 10){
            int sum = 0 ;
            while(num > 0){
                sum += (num % 10);
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
