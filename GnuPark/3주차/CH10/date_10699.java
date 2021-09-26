import java.text.SimpleDateFormat;
import java.util.Date;

public class date_10699 {
    public static void main(String[] args) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("YYYY-MM-dd");

        Date time = new Date();

        String today = timeFormat.format(time);

        System.out.println(today);
    }
}
