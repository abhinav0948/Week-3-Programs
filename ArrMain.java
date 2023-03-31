import java.util.Scanner;
public class ArrMain {
  
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
  int[] arr = new int[5];
  for (int i=0;i<arr.length;i++) {
    System.out.print("Enter the Number : ");
    arr[i]=s.nextInt();
    }
  int[] arr1=new int[4];
  for(int i=0;i<arr1.length;i++) {
    arr1[i]=arr[i];
  }
  for (int i=0;i<arr1.length;i++) {
    System.out.println(arr1[i]);
  }

 
}
}
