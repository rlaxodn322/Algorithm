import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = 1;
        int cnt =0;
        while(a>=1){
            if(a<b)b=1;
            a-=b;
            b++;
            cnt++;
        }
        System.out.print(cnt);
    }
}