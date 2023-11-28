import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            boolean b = false;
            for(int i=1; i<5; i++){
                if(arr[i-1] > arr[i]){
                    int c = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = c;
                    b = true;
                    for(int j=0; j<5; j++){
                        sb.append(arr[j]).append(" ");
                    }
                    sb.append("\n");
                }
            }
            if(!b) break;
        }
        System.out.print(sb);
    }
}