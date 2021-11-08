package vn.devpro.bai7Inheritance.bai2;

public class CongNhan extends NhanSu{

	protected XuongSX xuongSx;
	protected String congViec;
	protected int soNgayCong;
	

	public void nhap() {
		super.nhap();
		xuongSx = new XuongSX();
		xuongSx.nhap();
		System.out.print("Nhap cong viec: "); congViec = QuanLiNhanSu.scanner.nextLine();
		System.out.print("Nhap so ngay cong: "); soNgayCong = Integer.parseInt(QuanLiNhanSu.scanner.nextLine());
	}

	public void hienThi() {
		super.hienThi();
		xuongSx.hienThi();
		System.out.printf(" %15s %12d %,15.2f %n", congViec, soNgayCong, luong());
	}
	
	@Override
	public double luong() {
		if (soNgayCong >= 23) {
			return soNgayCong * 250000 + 500000;
		}
		else if (soNgayCong >= 20) {
			return soNgayCong * 250000 + 300000;
		} 
		else if (soNgayCong >= 18) {
			return soNgayCong * 250000;
		}
		else {return soNgayCong * 250000 - 200000;}
		
	}
	public CongNhan() {
		super();
	}
	
	public CongNhan(XuongSX xuongSx, String congViec, int soNgayCong) {
		super();
		this.xuongSx = xuongSx;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
	}
	
	public XuongSX getXuongSx() {
		return xuongSx;
	}
	public void setXuongSx(XuongSX xuongSx) {
		this.xuongSx = xuongSx;
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	
	
	
}
