import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[] = new int[a];
        for(int i=0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int b= sc.nextInt();
        for(int i=0; i<b; i++){
            int c = sc.nextInt();
            int s = 0;
            int e = arr.length-1;
            int cnt =0;
            while(s<=e){
                int m = (s+e)/2;
                if(c>arr[m]){
                    s = m+1;
                }else if(c<arr[m]){
                    e = m-1;
                }else{
                    System.out.println(1);
                    cnt = 1;
                    break;
                }
            }
            if(cnt != 1){
                System.out.println(0);
            }
        }
    }
}