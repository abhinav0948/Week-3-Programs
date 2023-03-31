import java.util.Scanner;
public class ArrayComplex {
  
public void remove(int[] arr1,int pos) {
int j=0;
int[] newArr=new int[4];
for( j=0;j<newArr.length-1;j++) {

if(j>=pos) {
newArr[j]=arr1[j+1];
}
else{
newArr[j]=arr1[j];
}
}
newArr[j]=arr1[j+1];
for(int i=0;i<newArr.length;i++) {
 System.out.println(newArr[i]);
}
}
  
  public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
for(int j=0;j<arr.length;j++) {
System.out.println("Enter number "+(j+1) );
arr[j]=sc.nextInt();
}
System.out.println("Enter index postion to remove element");
int pos=sc.nextInt();
ArrayComplex obj=new ArrayComplex();
 obj.remove(arr,pos);
}
}

