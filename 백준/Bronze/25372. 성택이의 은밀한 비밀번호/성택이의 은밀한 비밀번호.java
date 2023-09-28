import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       for(int i=0; i<a; i++){
           String b = sc.next();
           if(b.length()>=6 && b.length()<=9){
               System.out.println("yes");
           }else{
               System.out.println("no");
           }
       }
    }
}