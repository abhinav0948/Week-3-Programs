// A program by Abhinav

import java.util.Scanner;

public class Frequency
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Number of elements you want to enter : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int visited[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = s.nextInt();
        }
        System.out.println("===================================================================");
        for (int i = 0; i < n; i++)
        {
            int count = 1;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] == arr[j])
                {
                    count++;
                    visited[j] = -1;
                }
            }
            if (visited[i] != -1)
            {
                visited[i] = count;
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (visited[i] != -1)
            {
                System.out.println("frequency of " + arr[i] + " is " + visited[i]);
            }
        }
        System.out.println("====================================================================");
    }

}
