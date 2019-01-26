package newfeature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {

	public static void main(String[] args) {
		
		/*LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy= date.getYear();
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		System.out.printf("\n%d:%d:%d:%d",h,m,s,ns);*/
		
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
		LocalDateTime dt = LocalDateTime.of(1992, 4, 5, 12, 25);
		System.out.println(dt);
		System.out.println("After Six Month : "+dt.plusMonths(6));
		System.out.println("Before Six Month : "+dt.minusMonths(5));

	}

}
