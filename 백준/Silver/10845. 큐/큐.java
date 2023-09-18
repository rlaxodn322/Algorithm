import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();
        int b =0;
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if(s.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
                b = x;
            }else{
                if(s.equals("pop")){
                    if(q.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(q.poll());
                    }
                }else if(s.equals("size")){
                    sb.append(q.size());
                }else if(s.equals("empty")){
                    if(q.isEmpty()){
                        sb.append(1);
                    }else{
                        sb.append(0);
                    }
                }else if(s.equals("front")){
                    if(q.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(q.peek());
                    }
                }else if(s.equals("back")){
                    if(q.isEmpty()){
                        sb.append(-1);
                    }else{
                        sb.append(b);
                    }
                }
                sb.append('\n');
            }
            
        }
        System.out.println(sb);
    }
}