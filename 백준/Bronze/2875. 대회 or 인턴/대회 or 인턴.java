import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        while(a>=2 && b>=1 && a+b >=3+c){
            a-=2;
            b-=1;
            cnt++;
        }
        System.out.print(cnt);
    }
}