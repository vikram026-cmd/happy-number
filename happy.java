/*A happy number is a number defined by the following process:

Start with any positive integer n.
Replace the number by the sum of the squares of its digits.
Repeat the process until:
The number becomes 1 (then it is happy), OR
It loops endlessly in a cycle (then it is not happy).
Determine whether a given number is a happy number.
 */
import java.util.Scanner;
public class happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // We'll use a loop to keep checking until we find 1 or detect a cycle
        while (n != 1 && n != 4) {
            n = sumOfSquares(n);
        }

        if (n == 1) {
            System.out.println("Happy");
        } 
        else {
            System.out.println("Not Happy");
        }
    }

    // This method calculates the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
