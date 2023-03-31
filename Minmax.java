import java.util.*;

public class Minmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        int[] arr = new int[n];
        int i = 0, j = 0;
        System.out.println("Enter the values : ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("A order : ");
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

        System.out.println("min and secmin : " + arr[0] + " and " + arr[1]);
        System.out.println("maX and SECMAX : " + arr[n - 1] + " and " + arr[n - 2]);

    }

}
