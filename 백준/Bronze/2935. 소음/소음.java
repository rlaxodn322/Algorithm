import java.util.*;
import java.math.*;
import java.io.*;
public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String b = br.readLine();
        BigInteger c = new BigInteger(br.readLine());
        if(b.equals("*")){
            System.out.print(a.multiply(c));
        }else if(b.equals("+")) {
            System.out.print(a.add(c));
        }else if(b.equals("-")){
            System.out.print(a.subtract(c));
        }else if(b.equals("/")){
            System.out.print(a.divide(c));
        }
    }
}