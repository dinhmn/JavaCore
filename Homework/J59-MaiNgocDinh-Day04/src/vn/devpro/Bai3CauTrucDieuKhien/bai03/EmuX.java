package vn.devpro.Bai3CauTrucDieuKhien.bai03;

public class EmuX {
	//Su dung cac ham co san
	public static double myExp1(double x, double epsilon) {
		double s = 0, saiSo = 1;
		int i = 1;
		while (Math.abs(saiSo) >= epsilon) {
			s += saiSo;
			saiSo = Math.pow(x, i) / GiaiThua.giaiThua(i);
			i++;
		}
		return s;
	}
	public static void thucHien() {
		double x, epsilon;
		System.out.print("\nNhap so thuc x: "); 
		x = Double.parseDouble(ThucThiCacBaiToan.sc.nextLine());
		do {
			System.out.print("Nhap sai so (0 < epsilon < 0.001): ");
			epsilon = Double.parseDouble(ThucThiCacBaiToan.sc.nextLine());
		} while (epsilon <= 0 || epsilon >= 0.001);
		
		System.out.printf("Ket qua: %.7f %n", myExp1(x, epsilon));
	}
}
