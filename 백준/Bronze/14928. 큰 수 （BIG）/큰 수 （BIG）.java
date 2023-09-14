import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long l = 0;
        int a = 20000303;
        for(int i=0; i<s.length(); i++){
            l = (l*10+(s.charAt(i)-'0'))%a;
        }
        System.out.print(l);
    }
}