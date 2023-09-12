import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<a; i++){
            q.add(i+1);
        }
        while(q.size()>1){
            q.remove();
            int b= q.poll();
            q.add(b);
        }
        System.out.print(q.peek());
    }
}