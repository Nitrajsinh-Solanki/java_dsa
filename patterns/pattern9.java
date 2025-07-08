import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int stars = rows * 2 - 1;  // Start with 8 stars when rows = 5

        for (int i = 0; i < rows; i++) {
            // Print spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

            // Decrease stars by 2 for next row
            stars -= 2;
            if (stars < 1) {
                stars = 1; // Last row has at least 1 star
            }
        }

        sc.close();
    }
}


/*

*********
 *******
  *****
   ***
    *




 */