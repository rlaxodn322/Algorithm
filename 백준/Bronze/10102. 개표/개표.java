import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        String s = sc.next();
        int acnt = 0;
        int bcnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A')acnt++;
            else bcnt++;
        }
        if(acnt>bcnt)System.out.print("A");
        else if(acnt<bcnt)System.out.print("B");
        else System.out.print("Tie");
    }
}