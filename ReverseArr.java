import java.util.*;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Elements of the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(("Reverse of all elements "));
        int j = 0;
        for (int i = 0; i < n; i++) {
            int rev = 0;
            for (j = arr[i]; j > 0; j = j / 10) {
                int rem = j % 10;
                rev = rev * 10 + rem;
            }
            System.out.println(rev + " ");
        }
        s.close();
    }

}
