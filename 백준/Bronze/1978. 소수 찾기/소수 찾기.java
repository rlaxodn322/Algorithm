import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            for(int j=2; j<=b; j++){
                if(j==b){
                    count++;
                }
                if(b%j==0){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}