import java.util.*;
public class Main{
    public static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0; i<a; i++){
            int c = sc.nextInt();
            arr[i] = Math.abs(c-b);
        }
        int x = arr[0];
        for(int i=1; i<arr.length; i++){
            x = gcd(x,arr[i]);
        }
        System.out.print(x);
    }
}