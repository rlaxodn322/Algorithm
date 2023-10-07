import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String arr[] = {"000","001","010","011","100","101","110","111"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i)-'0';
            sb.append(arr[a]);
        }
        if(s.equals("0"))System.out.print(s);
        else{
            while(sb.charAt(0)=='0')sb = new StringBuilder(sb.substring(1));
            System.out.print(sb);
        }
    }
}