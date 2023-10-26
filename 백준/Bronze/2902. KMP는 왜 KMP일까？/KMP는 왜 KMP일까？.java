import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ss += s.charAt(i);
            }
        }
        System.out.print(ss);
    }
}