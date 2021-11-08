package vn.devpro.bai3ChuaBaiTap.Bai2;

import java.io.IOException;

public class BaiToanMot {

	public static void thucHien() {
		
		// Mot chu so la mot ky tu
		char n = ' ';
//		System.out.println("n = "); n = Integer.parseInt(Bai2.sc.nextLine());
//		BaiToanMot.docChuSo(n);
		try {
			n = (char)System.in.read();
		} catch (IOException e) {
			System.out.println("Ky tu khong hop le");
			// TODO: handle exception
		}
		
		
		BaiToanMot.docChuSo(n);
		Bai2.scanner.nextLine();
	}

	private static void docChuSo(char n) {
		// TODO Auto-generated method stub
		
	}
	
}
