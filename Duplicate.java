import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the size of the array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
            arr[i] = 0;
        }
        System.out.println("Elements after removing duplicates");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
