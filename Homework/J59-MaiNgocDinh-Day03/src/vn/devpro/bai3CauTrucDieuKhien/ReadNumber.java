package vn.devpro.bai3CauTrucDieuKhien;

import java.io.IOException;

public class ReadNumber {

	public static void thucThi() {
		
		char n = ' ';
		System.out.println(" n = ");
		
		try {
			n = (char)System.in.read();
					
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Ky tu khong hop le");
		}
		
		ReadNumber.docChuSo(n);
		Problem2.scanner.nextLine();
		
		
	}
	
	public static void docChuSo(char n) {
		
		switch (n) {
		case '0':
			System.out.println("so khong"); break;
		case '1':
			System.out.println("so mot"); break;
		case '2': 
			System.out.println("so hai"); break;
		case '3':
			System.out.println("so ba"); break;
		case '4':
			System.out.println("so bon"); break;
		case '5':
			System.out.println("so nam"); break;
		case '6':
			System.out.println("so sau"); break;
		case '7':
			System.out.println("so bay"); break;
		case '8':
			System.out.println("so tam"); break;
		case '9':
			System.out.println("so chin"); break;

		default:
			System.out.println("vui long nhap lai!!!");
		}
		
	}
	
}
