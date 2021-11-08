package vn.devpro.Bai5CalendarDateEnum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDeno {
	
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat  df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String dateStr = df.format(date);
		System.out.println("Today is " + dateStr);
//		NHap ngay sinh va luu
		System.out.print("Nhap ngay sinh (dd/mm/yyyy): ");
		String dateOfBirth = (new Scanner(System.in).nextLine());
		DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date dob = df1.parse(dateOfBirth);
			System.out.println("dob: " + dob);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ngay sinh khong dung dinh dang");
		}
		
	}
}
