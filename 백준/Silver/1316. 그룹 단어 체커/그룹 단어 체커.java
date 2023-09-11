import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int cnt = a;
        for(int i=0; i<a; i++){
            String s = sc.next();
            boolean b[] = new boolean[26];
            for(int j=0; j<s.length()-1; j++){
                if(s.charAt(j)!= s.charAt(j+1)){
                    if(b[s.charAt(j+1)-'a']){
                        cnt--;
                        break;
                    }
                }
                b[s.charAt(j)-'a'] = true;
            }
        }
        System.out.print(cnt);
    }
}