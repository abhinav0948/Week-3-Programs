import java.util.Scanner;
public class Array {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++) {
System.out.println("Enter number"+(i+1));
arr[i]=s.nextInt();
}
for(int j=0;j<arr.length;j++) {
System.out.println(arr[j]);
}
}
}
