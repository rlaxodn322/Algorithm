import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a= Integer.parseInt(st.nextToken());
      int b= Integer.parseInt(st.nextToken());
      if(a>b){
          System.out.print(a+b);
      }else{
          System.out.print(b-a);
      }
    }
}