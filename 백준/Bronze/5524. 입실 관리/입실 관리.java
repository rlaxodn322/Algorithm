import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<a; i++){
            String s = sc.next();
            sb.append(s.toLowerCase()).append("\n");
        }
        System.out.print(sb);
    }
}