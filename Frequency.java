
// A program by Abhinav

import java.util.Scanner;

public class Frequency {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Number of elements you want to enter : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
        System.out.println("===================================================================");
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr1[j] = -1;
                }
            }
            if (arr1[i] != -1) {
                arr1[i] = count;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr1[i] != -1) {
                System.out.println("frequency of " + arr[i] + " is " + arr1[i]);
            }
        }

        System.out.println("====================================================================");
    }

}
