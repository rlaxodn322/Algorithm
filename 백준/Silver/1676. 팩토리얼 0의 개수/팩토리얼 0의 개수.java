import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int count =0;
        while(a>=5){
            count += a/5;
            a /= 5;
        }
        System.out.print(count);
    }
}