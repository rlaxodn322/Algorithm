import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a') cnt++;
            else if(s.charAt(i)=='e') cnt++;
            else if(s.charAt(i)=='i') cnt++;
            else if(s.charAt(i)=='o') cnt++;
            else if(s.charAt(i)=='u') cnt++;
        }
        System.out.print(cnt);
    }
}