import java.io.*;
import java.util.*;

public class Main {

    static class Stack {
        int x;
        int size = 0; 
        int arr[];

        public Stack(int x) {
            this.x = x;
            arr = new int[x];
        }

        public void push(int x) {
            arr[size++] = x;
        }

        public int pop() {
            if (size() == 0) {
                return -1;
            }

            return arr[--size];
        }

        public int size() {
            return size;
        }

        public int empty() {
            if (size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int top() {
            if (size() == 0) {
                return -1;
            }

            return arr[size - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack(a);

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String str = st.nextToken();

            if (str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            } else if (str.equals("pop")) {
                sb.append(stack.pop()+"\n");
            } else if (str.equals("top")) {
                sb.append(stack.top()+"\n");
            } else if (str.equals("size")) {
                sb.append(stack.size()+"\n");
            } else if (str.equals("empty")) {
                sb.append(stack.empty()+"\n");
            }

        }

        System.out.println(sb);
    }
}