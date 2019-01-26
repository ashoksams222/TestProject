package newfeature;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class BithdayCountYear {

	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1992, 5, 28);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthday, today);
		System.out.printf("Age of %d Year %d Month %d Days",p.getYears(),p.getMonths(),p.getDays());
		

	}

}
