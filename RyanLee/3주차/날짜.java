//백준 10699

import java.text.SimpleDateFormat;
import java.util.Date;

public class 날짜 {
	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
        Date date = new Date();

		System.out.println(format.format(date));
	}
}