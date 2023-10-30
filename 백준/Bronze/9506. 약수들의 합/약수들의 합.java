import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            if(a==-1){
                break;
            }
            int arr[] = new int[a];
            int sum = 0;
            int cnt = 0;
            for(int i=1; i<=a/2; i++){
                if(a%i==0){
                    arr[cnt++] = i;
                    sum += i;
                }
            }
            if(sum!= a){
                System.out.println(a + " is NOT perfect.");
                continue;
            }
            System.out.print(a+" = ");
            for(int i=0; i<cnt; i++){
                if(i==cnt-1) System.out.print(arr[i]);
                else System.out.print(arr[i] + " + ");
            }
            System.out.println("");
        }
    }
}