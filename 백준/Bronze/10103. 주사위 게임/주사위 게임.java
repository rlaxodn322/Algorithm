import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = 100;
        int y = 100;
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b>c){
                y -= b;
            }else if(b<c){
                x -= c;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}