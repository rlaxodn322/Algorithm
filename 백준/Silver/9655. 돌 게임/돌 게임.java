import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(aa(a));
    }
    public static String aa(int a){
        return a%2==1 ? "SK" : "CY";
    }
}