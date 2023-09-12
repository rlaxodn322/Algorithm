import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i=0; i<a; i++){
            q.add(i+1);
        }
        while(q.size()>1){
            for(int i=0; i<b-1; i++){
                int c = q.poll();
                q.add(c);
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.print(sb);
    }
}