import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        if(a<12){
            System.out.print("280");
        }else if(a>16){
            System.out.print("280");
        }else if(a>11 && a<17){
            if(b>0){
                System.out.print("280");
            }else if(b==0){
                System.out.print("320");
            }
        }
        
    }
}