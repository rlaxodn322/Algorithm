import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Main{
    public static void main(String args[]){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
	    String strToday = sdf.format(c1.getTime());
        System.out.println(strToday);
    }

}