package Q_05;
import java.text.SimpleDateFormat;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Date today;
        today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM dd, yyyy");
        System.out.println(sdf.format(today));
    }
}
