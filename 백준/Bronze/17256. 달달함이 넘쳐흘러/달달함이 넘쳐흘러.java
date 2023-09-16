import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[3];
      for(int i=0; i<arr.length; i++){
          arr[i] = sc.nextInt();
      }
      int brr[] = new int[3];
      for(int i=0; i<brr.length; i++){
          brr[i] = sc.nextInt();
      }
      int a = brr[0]- arr[2];
      int b = brr[1]/arr[1];
      int c = brr[2]-arr[0];
      System.out.print(a +" "+ b+" "+c);
    }
}