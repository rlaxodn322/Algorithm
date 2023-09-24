import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.next();
            int a =sc.nextInt();
            int b = sc.nextInt();
            if(s.equals("#") && a==0 && b==0){
                break;
            }
            if(a>=18 || b>=80){
                System.out.println(s+" "+"Senior");
            }else{
                System.out.println(s+" "+"Junior");
            }
        }
    }
}