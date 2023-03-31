import java.util.Scanner;

public class Minfs {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the 1 elements of array : ");
        arr[0] = s.nextInt();
        int min = arr[0];
        int secmin = 0;
        for (int i = 1; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " elements of array : ");
            arr[i] = s.nextInt();
            if (min > arr[i]) {
                secmin = min;
                min = arr[i];
            } else if (secmin > arr[i]) {
                secmin = arr[i];
            }
        }
        System.out.println("Min is : " + min);
        System.out.println("Second min is : " + secmin);
    }

}
