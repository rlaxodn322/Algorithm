import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<String> d = new ArrayDeque<>();
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            String s =st.nextToken();
            if(s.equals("push_front"))d.addFirst(st.nextToken());
            else if(s.equals("push_back"))d.addLast(st.nextToken());
            else if(s.equals("size"))sb.append(d.size()).append('\n');
            else if(s.equals("empty")){
                if(d.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }else if(s.equals("pop_front")){
                if(d.isEmpty()) sb.append(-1).append('\n');
                else sb.append(d.pollFirst()).append('\n');
            }else if(s.equals("pop_back")){
                if(d.isEmpty()) sb.append(-1).append('\n');
                else sb.append(d.pollLast()).append('\n');
            }else if(s.equals("front")){
                if(d.isEmpty()) sb.append(-1).append('\n');
                else sb.append(d.peekFirst()).append('\n');
            }else if(s.equals("back")){
                if(d.isEmpty()) sb.append(-1).append('\n');
                else sb.append(d.peekLast()).append('\n');
            }
            
        }
        System.out.print(sb);
    }
    
}