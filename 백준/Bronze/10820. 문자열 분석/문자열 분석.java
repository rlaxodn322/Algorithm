import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            int small = 0;
            int large = 0;
            int num = 0;
            int blank = 0;
            for(int i=0; i<s.length(); i++){
                if(97<=s.charAt(i)&&s.charAt(i)<=122){
                    small++;
                }else if(65<=s.charAt(i) && s.charAt(i)<=90){
                    large++;
                }else if(48<=s.charAt(i) && s.charAt(i)<=57){
                    num++;
                }else{
                    blank++;
                }
            }
            System.out.println(small+" "+large+" "+num+" "+blank);
        }
    }
}