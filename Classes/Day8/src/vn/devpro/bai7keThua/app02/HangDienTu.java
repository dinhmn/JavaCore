package vn.devpro.bai7keThua.app02;

public class HangDienTu extends SanPham {

	private double congSuat;
	private double giaTien;
	
	public void nhap() {
		super.nhap();
		System.out.print("\tCong suat: "); congSuat = Double.parseDouble(SanPham.sc.nextLine());
		System.out.print("\tGia tien: "); giaTien = Double.parseDouble(SanPham.sc.nextLine());
		
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%9.2f %13.2f %n", congSuat, giaTien);
	}
	
	
	public HangDienTu() {
		super();
	}

	public HangDienTu(String maSanPham, String tenSp, String ngaySanXuat, double congSuat, double giaTien) {
		super(maSanPham, tenSp, ngaySanXuat);
		this.congSuat = congSuat;
		this.giaTien = giaTien;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	
	
	
	
}
