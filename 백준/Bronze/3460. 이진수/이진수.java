import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            int cnt = 0;
            while(b>0){
                if(b%2==1){
                    System.out.print(cnt+" ");
                }
                cnt++;
                b /=2;
            }
            System.out.println();
        }
    }
}