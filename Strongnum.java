import java.util.Scanner;

public class Strongnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            int fact = 1;
            for (int i = 1; i <= last; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
