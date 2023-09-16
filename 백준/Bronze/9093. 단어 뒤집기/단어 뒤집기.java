import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int a= Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                StringBuilder sa = new StringBuilder(st.nextToken());
                sb.append(sa.reverse()+" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        
    }
}