import java.util.Scanner;
public class Main{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int a= sc.nextInt();
    int sum =1;
    for(int i=a; a>1; a--){
        sum = sum * a;
    }
    System.out.println(sum);
}

}