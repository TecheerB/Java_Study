import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class problem10699 {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        System.out.format(df.format(date));

//        LocalDate date = LocalDate.now();
//        System.out.println(date);
    }
}
