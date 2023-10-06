import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = s.length();
        if(a%3==1)System.out.print( (s.charAt(0))-'0');
        else if(a%3==2) System.out.print( (s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        for(int i=a%3; i<a; i+=3){
            System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
        }
    }
}