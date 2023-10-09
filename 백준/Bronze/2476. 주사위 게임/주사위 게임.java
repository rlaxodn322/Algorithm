import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();;
        int max = 0;
        for(int i=0; i<a; i++){
            int max2 = 0;
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(b==c && c==d){
                max2 = 10000 + (b * 1000);
            }else if(b!=c && c!=d && b!= d){
                max2 = Math.max(b, Math.max(c,d))*100;
            }else{
                if(b==c || b==d){
                    max2 = 1000 + (b*100);
                }else{
                    max2 = 1000 + (c*100);
                }
            } 
            if(max2>max){
                max = max2;
            }
        }
        System.out.print(max);
    }
}