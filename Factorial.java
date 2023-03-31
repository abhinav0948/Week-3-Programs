
// A program by Abhinav

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long num = 0, factorial = 1;
        System.out.println();
        System.out.print("Enter the number : ");
        num = s.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("the factorial of " + num + " is " + factorial);
    }
}
