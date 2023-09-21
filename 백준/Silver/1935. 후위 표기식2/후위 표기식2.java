import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int arr[] = new int[a];
        String s = br.readLine();
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && 'Z'>=c){
                double d = arr[c-'A'];
                stack.push(d);
            }else{
                double d1 = stack.pop();
                double d2 = stack.pop();
                switch(c){
                    case '*': 
                        stack.push(d2*d1);
                        break;
                    case '/': 
                        stack.push(d2/d1);
                        break;
                    case '-': 
                        stack.push(d2-d1);
                        break;
                    case '+': 
                        stack.push(d2+d1);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}