import java.util.*;
    public class Main{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt(),b = sc.nextInt();;
            int c = sc.nextInt(), d =sc.nextInt();
            System.out.print(Math.min(a+d, b+c));
        }
    }