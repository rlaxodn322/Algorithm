import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        String s = br.readLine();
        for(int i=0; i<s.length(); i++){
            left.push(s.charAt(i));
        }
        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            String str = br.readLine();
            switch(str.charAt(0)){
                case 'L' : if(left.isEmpty()) break;
                            right.push(left.pop());
                            break;
                case 'D' : if(right.isEmpty()) break;
                            left.push(right.pop());
                            break;
                case 'B' : if(left.isEmpty()) break;
                            left.pop();
                            break;
                case 'P' : left.push(str.charAt(2));
                            break;
            }
        }
        while(!left.isEmpty()){
            right.push(left.pop());
        }
        while(!right.isEmpty()){
            sb.append(right.pop());
        }
        System.out.print(sb);
    }
}