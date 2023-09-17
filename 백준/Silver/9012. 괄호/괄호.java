import java.util.*;
public class Main{
    public static String aa(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(')stack.push(c);
            else if(stack.isEmpty()) return "NO";
            else stack.pop();
        }
        if(stack.isEmpty()) return "YES";
        else return "NO";
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            System.out.println(aa(sc.next()));
        }
    }
}