import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=a; i++){
            System.out.println(i+". "+sc.nextLine());
        }
    }
}