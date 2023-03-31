import java.util.Scanner;

public class Maxfs {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the 1 elements of array : ");
        arr[0] = s.nextInt();
        int max = arr[0];
        int secmax = 0;
        for (int i = 1; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " elements of array : ");
            arr[i] = s.nextInt();
            if (max < arr[i]) {
                secmax = max;
                max = arr[i];
            } else if (secmax < arr[i]) {
                secmax = arr[i];
            }
        }
        System.out.println("Max is : " + max);
        System.out.println("Second max is : " + secmax);
    }

}
