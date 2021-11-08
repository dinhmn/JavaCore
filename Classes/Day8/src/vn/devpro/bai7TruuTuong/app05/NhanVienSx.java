package vn.devpro.bai7TruuTuong.app05;

import java.util.Calendar;
import java.util.Date;

public class NhanVienSx extends NhanVien{

	private double sanPham;

	public void nhap() {
		super.nhap();
		System.out.print("\tSan pham: ");
		sanPham = Double.parseDouble(NhanVien.sc.nextLine());
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.printf("%10.2f %13s %10s %,14.2f %n", sanPham, "-------------", "----------",luong());
	}
	
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		return sanPham * 35000 + 150000 + (cal.get(Calendar.YEAR) - namVaoLam) * 50000;
	}
	
	public NhanVienSx() {
		super();
	}

	public NhanVienSx(double sanPham) {
		super();
		this.sanPham = sanPham;
	}

	public double getSanPham() {
		return sanPham;
	}

	public void setSanPham(double sanPham) {
		this.sanPham = sanPham;
	}
	
	
	
}
