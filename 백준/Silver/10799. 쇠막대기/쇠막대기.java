import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Stack<Character> stack = new Stack<>();
       String s = br.readLine();
       int cnt = 0;
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='('){
               stack.push(s.charAt(i));
               continue;
           }else if(s.charAt(i)==')'){
               stack.pop();
               if(s.charAt(i-1)=='('){
                   cnt += stack.size();
               }else{
                   cnt++;
               }
           }
       }
       System.out.print(cnt);
    }
}