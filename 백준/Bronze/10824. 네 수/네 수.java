import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        
        String X = a+b;
        String Y = c+d;
        
        long A = Long.parseLong(X);
        long B = Long.parseLong(Y);
        
        System.out.print(A+B);
    }
}

