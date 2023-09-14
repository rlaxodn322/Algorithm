import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[][] = new int[a][2];
        
        for(int i=0; i<a; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, (a1, a2) -> {
            if(a1[0]==a2[0]){
                return a1[1] - a2[1];
            }else{
                return a1[0] - a2[0];
            }
        });
        for(int i=0; i<a; i++){
        System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}