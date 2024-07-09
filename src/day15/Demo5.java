package day15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo5 {

	public static void main(String[] args) {
		// write a java code to get todays date
		
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM YYYY");
		String mY = d.format(format);
		System.out.println(mY);
		
		format = DateTimeFormatter.ofPattern("dd");
		String day = d.format(format);
		System.out.println(day);
		System.out.println("//div[text()='June 2024']/../..//p[text()='15']");
		System.out.println("//div[text()='"+mY+"']/../..//p[text()='"+day+"']");

	}

}
