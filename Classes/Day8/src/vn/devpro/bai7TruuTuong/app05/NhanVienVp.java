package vn.devpro.bai7TruuTuong.app05;

import java.util.Calendar;

public class NhanVienVp extends NhanVien {

	private double mucLuong;
	private double soNgayNghi;
	
	public void nhap() {
		super.nhap();
		System.out.print("\tMuc luong: "); mucLuong = Double.parseDouble(NhanVien.sc.nextLine());
		System.out.print("\tSo ngay nghi: "); soNgayNghi = Double.parseDouble(NhanVien.sc.nextLine());
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%10s %13.2f %10.2f %,14.2f %n", "----------",mucLuong, soNgayNghi, luong());
	}
	
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		return mucLuong - soNgayNghi * 25000 + 150000 + (cal.get(Calendar.YEAR) - namVaoLam) * 50000;
	}
	
	public NhanVienVp() {
		super();
	}

	public NhanVienVp(String maNv, String hoTen, int namVaoLam, double mucLuong, double soNgayNghi) {
		super(maNv, hoTen, namVaoLam);
		this.mucLuong = mucLuong;
		this.soNgayNghi = soNgayNghi;
	}

	public double getMucLuong() {
		return mucLuong;
	}

	public void setMucLuong(double mucLuong) {
		this.mucLuong = mucLuong;
	}

	public double getSoNgayNghi() {
		return soNgayNghi;
	}

	public void setSoNgayNghi(double soNgayNghi) {
		this.soNgayNghi = soNgayNghi;
	}
	
	
	
	
}
