import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[10];
        int arr2[] = new int[a];
        for(int i=0; i<a; i++){
            for(int j=0; j<10; j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            arr2[i] = arr[7];
        }
        for(int i=0; i<a; i++){
            System.out.println(arr2[i]);
        }
        
        
    }
}