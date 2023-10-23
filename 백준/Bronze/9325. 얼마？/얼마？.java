import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j=0; j<c; j++){
                int q = sc.nextInt();
                int p = sc.nextInt();
                b += (q*p);
            }
            System.out.println(b);
           
        }
    }
}