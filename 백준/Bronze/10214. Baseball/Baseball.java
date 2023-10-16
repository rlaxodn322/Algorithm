import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=0; i<a; i++){
            int y = 0;
            int k = 0;
            for(int j=0; j<9; j++){
                int b = sc.nextInt();
                y += b;
                int c = sc.nextInt();
                k += c;
            }
            if(y>k){
                System.out.println("Yonsei");
            }else if(y<k){
                System.out.println("Korea");
            }else{
                System.out.println("draw");
            }
        }
    }
}