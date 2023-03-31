import java.util.Scanner;
class Arraymaxmin {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
int[] arr = new int[8];
   int max=0,min=0;
System.out.print("Enter the Number : ");
     arr[0] = s.nextInt();
    max=arr[0];
    min=arr[0];
    for (int i=1;i<arr.length;i++) {
    System.out.print("Enter the Number : ");
      arr[i] = s.nextInt();
      if(arr[i]>max) {
        max=arr[i];
      }
      if(arr[i]<min) {
        min=arr[i];
      }
     }
    System.out.println("Max is : "+max);
    System.out.println("Min is : "+min);
  }
}