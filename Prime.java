import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int count = 0;
        System.out.print("ENter number of values you need to store in an array : ");
        n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " value : ");
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < arr[i] / 2; i++) {
            if (arr[i] % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }
    }
}
