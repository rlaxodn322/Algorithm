import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            if('A'<=s.charAt(i)&& 'Z'>=s.charAt(i)){
                if(s.charAt(i)+13>'Z'){
                    int num = s.charAt(i)+13 -91;
                    c[i] = (char) (65+num);
                }else{
                    c[i] = (char)(s.charAt(i)+13);
                }
            }else if('a'<= s.charAt(i) && 'z'>=s.charAt(i)){
                if(s.charAt(i)+13 > 'z'){
                    int num = s.charAt(i)+13 -123;
                    c[i] = (char)(97+num);
                }else{
                    c[i] = (char)(s.charAt(i)+13);
                }
            }else{
                c[i]= (char)(s.charAt(i));
            }
        }
        for(int i=0; i<c.length; i++){
        System.out.print(c[i]);
            
        }
    }
}