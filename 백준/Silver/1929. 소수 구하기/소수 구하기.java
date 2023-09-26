import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int arr[] = new int[b+1];
        for(int i=2; i<=b; i++){
            arr[i] = i;
        }
        for(int i=2; i<=b; i++){
            if(arr[i]==0)continue;
            for(int j= i+i; j<=b; j +=i){
                arr[j] =0;
             }
        }
        for(int i=a; i<=b; i++){
            if(arr[i]!=0)System.out.println(arr[i]);
        }
        
    }
}