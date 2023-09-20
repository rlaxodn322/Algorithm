import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int a = Integer.parseInt(br.readLine());
        int arr[] = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<a; i++){
            while(!stack.isEmpty() && arr[stack.peek()]< arr[i]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            arr[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a; i++){
            sb.append(arr[i]).append(' ');
        }
        System.out.print(sb);
    }
}