import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.next();
            boolean b = true;
            if(s.equals("0")){
                break;            
            }
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i)!= s.charAt(s.length()-i-1)){
                    b = false;
                }
            }
            if(b){
                 System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}