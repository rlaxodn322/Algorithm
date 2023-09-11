import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print((int)(a*0.78)+" "+(int)(a*0.8+ (a*0.2*0.78)));
    }
}