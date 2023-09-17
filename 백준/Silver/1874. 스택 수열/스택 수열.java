import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int a= sc.nextInt();
        int data =0;
        while(a-->0){
            int b = sc.nextInt();
            if(data<b){
                for(int i=data+1; i<=b; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                data =b;
            }else if(stack.peek() != b){ 
                System.out.print("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.print(sb);
    }
}