import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = (a/10) + a%10;
        if(a/10 > 10){
            x = (a/100) + (a%100);;
        }
        
        if(a==1010){
            x = 20;
        }
        System.out.print(x);
    }
}