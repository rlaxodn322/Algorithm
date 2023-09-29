import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        long sum = a + b;
        int c = sc.nextInt();
        if((c*2) <= sum ){
            sum -= (c*2);
        }
        System.out.print(sum);
    }
}