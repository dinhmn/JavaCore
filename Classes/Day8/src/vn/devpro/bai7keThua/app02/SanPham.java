package vn.devpro.bai7keThua.app02;

import java.util.Scanner;

public class SanPham {

	protected String maSanPham;
	protected String tenSp;
	protected String ngaySanXuat;
	
	static Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("\tMa san pham: ");
		maSanPham = sc.nextLine();
		System.out.print("\tTen san pham: "); tenSp = sc.nextLine();
		System.out.print("\tNgay san xuat (dd/mm/yyyy): "); ngaySanXuat = sc.nextLine();
		
	}
	
	public void hienThi() {
		System.out.printf("%-12s %-25s %-10s", maSanPham, tenSp, ngaySanXuat);
	}
	
	public SanPham() {
		super();
	}
	public SanPham(String maSanPham, String tenSp, String ngaySanXuat) {
		super();
		this.maSanPham = maSanPham;
		this.tenSp = tenSp;
		this.ngaySanXuat = ngaySanXuat;
	}
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public String getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(String ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	
	
	
}
