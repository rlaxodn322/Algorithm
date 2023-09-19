import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        boolean b = false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                b = true;
            }else if(s.charAt(i)=='>'){
                sb.append(s.charAt(i));
                b=false;
                continue;
            }
            if(b== true){
                sb.append(s.charAt(i));
            }else if(b==false){
                if(s.charAt(i)==' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                }else{
                    stack.push(s.charAt(i));
                }
            }
            if(i==s.length()-1){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        System.out.print(sb);
    }
}