import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int arr2[] = new int[2];
        for(int i=0; i<arr2.length; i++){
            arr2[i]= sc.nextInt();
         }
         Arrays.sort(arr2);
         System.out.print(arr[3]+arr[2]+arr[1]+arr2[1]);
    }
}