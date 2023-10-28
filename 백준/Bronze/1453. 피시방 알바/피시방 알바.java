import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean b[] = new boolean[101];
        int a =sc.nextInt();
        int cnt = 0;
        for(int i=0; i<a; i++){
            int c =sc.nextInt();
            if(b[c]==true){
                cnt++;
            }else{
                b[c] = true;
            }
        }
        System.out.print(cnt);
    }
}