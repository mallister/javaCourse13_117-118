package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendar {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		Date d = Date.from(Instant.parse("2020-11-09T04:20:07Z"));
		
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//Calendar._field_, amount to Increase
		cal.add(Calendar.HOUR_OF_DAY, 4);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		d = cal.getTime();
		
		
		Calendar cal2 = Calendar.getInstance();
		*/
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		Calendar cal2 = Calendar.getInstance();
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		Date analysis = sdf2.parse(sc.nextLine());
		cal2.setTime(analysis);
		cal2.add(Calendar.MONTH, 1);
		System.out.println("analysis: " + analysis);
		System.out.println("analysis.: " + cal2.get(Calendar.MONTH));
		
		
		
		
	}

}
