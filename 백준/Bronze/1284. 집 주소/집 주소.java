import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String s = sc.next();
            int cnt = 1;
            if(s.equals("0"))break;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0')cnt += 5;
                else if(s.charAt(i)=='1')cnt+=3;
                else cnt+=4;
            }
            System.out.println(cnt);
        }
    }
}