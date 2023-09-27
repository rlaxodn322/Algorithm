import java.util.*;
import java.io.*;
public class Main{
    static long ff(long num){
        int count =0;
        while(num >= 5){
            count += num /5;
            num /=5;
        }
        return count;
    }
    static long tt(long num){
        int count =0;
        while(num>=2){
            count+= num/2;
            num/=2;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = ff(a) - ff(a-b) - ff(b);
        long y = tt(a) - tt(a-b) - tt(b);
        System.out.println(Math.min(x,y));
    }  
}