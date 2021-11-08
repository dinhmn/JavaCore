package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

public class BaiToan2 {

	public static void thucThi() {
		System.out.print("Nhap n: ");
		int n = Integer.parseInt(ThucThi.scanner.nextLine());
		int total = 0;
		for (int i = 0; i < n + 1; i++) {
			if(BaiToan1.soNguyenTo(i)) {
				total += i;
			}
			
		}
		System.out.printf("Total = %3d%n", total);
	}
	
}
