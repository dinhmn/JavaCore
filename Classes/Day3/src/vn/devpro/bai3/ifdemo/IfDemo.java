package vn.devpro.bai3.ifdemo;

public class IfDemo {

	public static void phepChia(float a, float b) {
		if (b != 0) {
			// Neu b khac 0 la dung
			float c = a / b;
			System.out.printf("%.2f / %.2f = %.3f", a, b, c);
		} else {
			System.out.println("Loi! so chia bang khong");
		}
	}
	
	// ham tinh tien dien
	/**
	 * @param k
	 * @return
	 */
	public static double totalElec(int k) {
		if ( k <= 50 ) {
			return k * 1678;
		}
		else if (k <= 100 ) {
			//Trong muc 2
			return 50 * 1678 + (k-50) * 1734;
		}
		else if ( k <= 200) {
			return 50 * 1678 + 50 * 1734 + (k - 100) * 2014;
			
		}else if ( k <= 300) {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + (k-200) * 2536;
			
		}else if ( k <= 300) {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (k-300) * 2834;
			
		}else {
			return 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 +(k - 400) * 2927;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float a = 5, b = 0;
//		phepChia(a, b);
//		System.out.println("The end");
		int k = 599;
		System.out.printf("\nTien dien: %,10.0f" , totalElec(k) * 1.1 );
	}

}
