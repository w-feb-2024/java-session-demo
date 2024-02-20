package datehandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate todaysDate = LocalDate.now();
		System.out.println(todaysDate);
		LocalDate date = LocalDate.of(2024, 01, 01);
		System.out.println(date);
		
		LocalDateTime todaysDateTime = LocalDateTime.now();
		System.out.println(todaysDateTime);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
	}

}
