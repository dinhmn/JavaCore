package vn.devpro.Bai3CauTrucDieuKhien.Bai4;

public class BaiToan3 {

	public static void thucThi() {
		System.out.println("=========BANG CUU CHUONG==========");
		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				System.out.printf("%2d * %2d = %3d  |", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println("==================================");
		
	}
	
	
	
}
