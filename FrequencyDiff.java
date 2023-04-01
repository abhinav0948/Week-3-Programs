import java.util.*;

public class FrequencyDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the size of the array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
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
        int max = 0, min = 1;
        for (int i = 0; i < n; i++) {

            if (max < arr1[i]) {
                max = arr1[i];

            }

        }
        System.out.println("max is : " + max);
        System.out.println("min is : " + min);
        System.out.println("diff is : " + (max - min));

    }
}
