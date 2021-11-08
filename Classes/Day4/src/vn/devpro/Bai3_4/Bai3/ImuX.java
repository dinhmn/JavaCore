package vn.devpro.Bai3_4.Bai3;

public class ImuX {

	public static double myExp1(double x, double epsilon) {
		double s = 1, saiSo = 1;
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
		System.out.println("\tNhap so thuc: ");
		x = Double.parseDouble(ThucThiCacBaiToan.scanner.nextLine());
		do {
			System.out.println("Nhap sai so (0 < epsilon < 0.001): ");
			epsilon = Double.parseDouble(ThucThiCacBaiToan.scanner.nextLine());
		}while(epsilon <= 0 || epsilon >= 0.001);
		
		
		System.out.printf("Ket qua: %.7f %n", myExp1(x, epsilon));
	}
}
