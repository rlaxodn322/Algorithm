import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int X[] = new int[a];
        int Y[] = new int[a];
        for(int i=0; i<a; i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        
        System.out.println((X[a-1] - X[0]) * (Y[a-1] - Y[0]));
    }
}