
// A program by Abhinav

import java.util.*;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number at " + i + " Position : ");
            arr[i] = s.nextInt();
        }
        int i = 0, j = 0;
        System.out.println("=========================================================================================");
        int target = 0;
        System.out.print("Enter target : ");
        target = s.nextInt();
        System.out.println("=========================================================================================");
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println("positions are " + i + " and " + j);
                }
            }

        }

    }
}
