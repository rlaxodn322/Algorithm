import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a= Integer.parseInt(sc.nextLine());
    for(int i = 0 ; i<a ; i++){
      String s = sc.nextLine();
      String[] arr = s.split(" ");
      double d = Double.parseDouble(arr[0]);
      for(int j = 1 ; j<arr.length ; j++){
        if(arr[j].equals("@")) d *= 3;
        else if(arr[j].equals("%")) d += 5;
        else if(arr[j].equals("#")) d -= 7;
      }
      System.out.println(String.format("%.2f",d));
    }

  }
}