import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();
        int a = Integer.parseInt(br.readLine());
        for(int i=1; i<=a; i++){
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            sb.append(q.poll()).append(" ");
            if(q.isEmpty())break;
            q.add(q.poll());
        }
        System.out.print(sb);
        
    }
}