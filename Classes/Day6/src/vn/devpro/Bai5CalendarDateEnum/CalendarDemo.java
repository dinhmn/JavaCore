package vn.devpro.Bai5CalendarDateEnum;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
//		cal.set(2019, 11, 16, 23, 0);
//		cal.add(Calendar.DAY_OF_MONTH, 365);
//		Cuon di 365 ngay
//		cal.roll(Calendar.DAY_OF_MONTH, 365);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		System.out.println("Today is " + day + "/" + month + "/" + year);
//		System.out.println();
//		Date d = cal.getTime();
		
//		System.out.println("d = " + d);
		
	}

}
