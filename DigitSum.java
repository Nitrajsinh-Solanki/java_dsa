import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        DigitSum p1 = new DigitSum();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();



        int res = p1.digitsSum(num);
        System.out.println("The sum of the digit is : " + res);
        sc.close();


    }
    public int digitsSum(int num){
        int sum = 0 ;
        
        while(num != 0){
            int lastDigit = num % 10 ;
            sum = sum + lastDigit;
            num = num / 10 ;
        }
        return sum;
    }
}
