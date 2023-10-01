import java.util.*;
public class Main{
    public static int gcd(int a, int b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0; i<a; i++){
            int b =sc.nextInt();
            int arr[] = new int[b];
            for(int j=0; j<b; j++){
                arr[j] = sc.nextInt();
            }
            long sum =0;
            for(int z=0;z<arr.length-1; z++){
                for(int k=z+1; k<arr.length; k++){
                    sum += gcd(arr[z],arr[k]);
                }
            }
            System.out.println(sum);
        }
    }
}