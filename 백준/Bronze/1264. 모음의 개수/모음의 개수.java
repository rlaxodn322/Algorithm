import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("#"))break;
            int cnt =0;
            char[] c = {'A','E','I','O','U','a','e','i','o','u'};
            for(int i=0; i<str.length(); i++){
                for(int j=0; j<c.length; j++){
                    if(str.charAt(i)==c[j]){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}