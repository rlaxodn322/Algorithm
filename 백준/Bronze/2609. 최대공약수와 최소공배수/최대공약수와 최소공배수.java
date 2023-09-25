import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = a,  B = b;
        while(B!=0){
            int x = A%B;
            A = B;
            B = x;
        }
        System.out.print(A+"\n"+ (a*b)/A );
    }
}