import java.util.Scanner;
class Arrayreverse {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
int[] arr = new int[8];
  int []arr1 = new int[8];
    System.out.println("========================================");
     System.out.println("Enter the numbers : ");
    for(int i=0;i<arr.length;i++) {
     arr[i]=s.nextInt();
    }
    System.out.println("========================================");
    System.out.println("Reverse Numbers are : ");
    
    for(int i=1;i<=arr.length;i++) {
      arr1[i-1]=arr[arr.length-i];
      System.out.println(arr1[i-1]);
    }
    System.out.println("========================================");
   }
}