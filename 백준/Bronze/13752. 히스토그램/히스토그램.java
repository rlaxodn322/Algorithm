import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        char c = '=';
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            while(b!=0){
                System.out.print(c);
                b--;
            }
            System.out.println();
        }
    }
}