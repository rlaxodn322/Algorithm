import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            int c= sc.nextInt();
            int cnt = 0;
            for(int j=b; j<=c; j++){
                int d = j;
                if(d==0){
                    cnt++;
                    continue;
                }
                while(d>1){
                    if(d%10==0)cnt++;
                    d/=10;
                }
               
            }
             System.out.println(cnt);
        }
    }
}