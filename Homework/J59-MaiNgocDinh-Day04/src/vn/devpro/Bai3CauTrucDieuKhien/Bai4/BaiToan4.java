package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

import vn.devpro.Bai3CauTrucDieuKhien.bai03.GiaiThua;
import vn.devpro.Bai3CauTrucDieuKhien.bai03.ThucThiCacBaiToan;

public class BaiToan4 {

	public static double sinX(double x, double epsilon) {
		double sinX = 0;
		double saiSo = 1;
		int i = 1;
		while(Math.abs(saiSo) > epsilon) {
			sinX += saiSo;
			saiSo = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / GiaiThua.giaiThua(2 * i + 1);
			i++;
		}
		
		
		return sinX;
	}

	public static void thucThi() {
		double x, epsilon;
		System.out.print("\nNhap so thuc x: "); 
		x = Double.parseDouble(ThucThi.scanner.nextLine());
		do {
			System.out.print("Nhap sai so (0 < epsilon < 0.001): ");
			epsilon = Double.parseDouble(ThucThi.scanner.nextLine());
		} while (epsilon <= 0 || epsilon >= 0.001);
		
		System.out.printf("Ket qua: %.7f %n", sinX(x, epsilon));
	}
	
}
