import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = (a/10)*(b/10);
        if((a-c)>=100){
            System.out.print(0);
        }else{
            System.out.print(1);
        }
    }
}