import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = new String[s.length()];
        for(int i=0; i<s.length(); i++){
            arr[i] = s.substring(i,s.length()); 
        }
        Arrays.sort(arr);
        for(int i=0; i<s.length(); i++){
            System.out.println(arr[i]);
        }
    }
}