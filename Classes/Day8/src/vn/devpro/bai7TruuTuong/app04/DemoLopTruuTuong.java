package vn.devpro.bai7TruuTuong.app04;

public class DemoLopTruuTuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HinhPhang ht = new HinhTron(100);
			System.out.println("Chu vi hinh tron la " + ht.chuVi());
			HinhPhang hcn = new HinhChuNhat(3, 5);
			
			System.out.println("Dien tich hinh chu nhat la " + hcn.dienTich());
		
	}

}
