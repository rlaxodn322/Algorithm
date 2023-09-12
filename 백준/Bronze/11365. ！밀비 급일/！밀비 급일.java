import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }
            for(int i=0; i<s.length(); i++){
                System.out.print(s.charAt(s.length()-i-1));
            }
            System.out.println();
        }
    }
}