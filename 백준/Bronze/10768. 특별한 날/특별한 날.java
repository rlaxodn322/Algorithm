import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a<2){
            System.out.print("Before");
        }else if(a==2){
            if(b>18){
                System.out.print("After");
            }else if(b<18){
                System.out.print("Before");
            }else{
                System.out.print("Special");
            }
        }else{
            System.out.print("After");
        }
    }
}