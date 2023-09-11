import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr[] = new int[26];
        boolean b = false;
        for(int i=0; i<a; i++){
            String s =sc.next();
            char c = s.charAt(0);
            arr[c-97]++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>= 5){
                System.out.print((char)(i+97));
                b = true;
            }
        }
        if(b==false){
            System.out.print("PREDAJA");
        }
        
    }
}